package app.weather.local.core.service;

import app.weather.local.core.consumer.LocalConsumer;
import app.weather.local.core.document.Analise;
import app.weather.local.core.document.Usuario;
import app.weather.local.core.document.enums.EAnalise;
import app.weather.local.core.mapper.AnaliseMapper;
import app.weather.local.core.producer.LocalProducer;
import app.weather.local.core.repository.AnaliseRepository;
import app.weather.local.core.repository.LocalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocalService {
    private final LocalRepository localRepository;
    private final AnaliseRepository analiseRepository;
    private final AnaliseMapper analiseMapper;
    private final LocalProducer localProducer;
    private final LocalConsumer localConsumer;

    public void salvar(Usuario usuario) {
        localRepository.save(usuario);
    }

    public Usuario encontrarPeloId(String id) {
        return localRepository.findById(id).orElse(null);
    }

    public List<Usuario> encontrarTodos() {
        return localRepository.findAll();
    }

    public void deletarTodos() {
        localRepository.deleteAll();
    }

    public void deletarPeloId(String id) {
        localRepository.deleteById(id);
    }

    @Scheduled(cron = "0 0 0 * * *")
    public void iniciarSaga(){
        try {
            List<Usuario> usuarios = localRepository.findByAnalise(EAnalise.PARA_ANALISE);
            salvar(analiseMapper.map(usuarios));
            percorrerLista(usuarios);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    private void enviarParaFila(Usuario usuario){
        localProducer.enviarUsuario(usuario);
        removerDeAnalises(usuario);
    }

    private void removerDeAnalises(Usuario usuario){
        EAnalise analise = localConsumer.verificarPostagem(usuario);
        if (analise.equals(EAnalise.ANALISADO)){
            analiseRepository.deleteUsuariosById(usuario.getId());
        }
    }

    private void percorrerLista(List<Usuario> usuarios){
        usuarios.forEach(this::enviarParaFila);
    }

    private void salvar(Analise analise){
        analiseRepository.save(analise);
    }
}
