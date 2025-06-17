package app.weather.local.core.service;

import app.weather.local.core.document.Usuario;
import app.weather.local.core.repository.LocalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocalService {
    private final LocalRepository localRepository;

    public Usuario salvar(Usuario usuario) {
        return localRepository.save(usuario);
    }

    public Usuario encontrarPeloId(String id) {
        return localRepository.findById(id).orElse(null);
    }

    public List<Usuario> encontrarTodos() {
        return localRepository.findAll();
    }
}
