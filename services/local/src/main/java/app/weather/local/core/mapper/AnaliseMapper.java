package app.weather.local.core.mapper;

import app.weather.local.core.document.Analise;
import app.weather.local.core.document.Usuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnaliseMapper {

    public Analise map(List<Usuario> usuarios) {
        return Analise.builder()
                .usuarios(usuarios)
                .build();
    }
}
