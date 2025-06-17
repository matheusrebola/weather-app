package app.weather.local.core.service;

import app.weather.local.core.document.Usuario;
import app.weather.local.core.repository.LocalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LocalService {
    private final LocalRepository localRepository;

    public Usuario salvar(Usuario usuario) {
        return localRepository.save(usuario);
    }
}
