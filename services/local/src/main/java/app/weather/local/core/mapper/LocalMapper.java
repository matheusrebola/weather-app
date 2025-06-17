package app.weather.local.core.mapper;

import app.weather.local.core.document.Usuario;
import app.weather.local.core.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

@Component
public class LocalMapper {
    public Usuario map(UsuarioDTO dto) {
        return Usuario.builder()
                .local(dto.getLocal())
                .dispositivo(dto.getDispositivo())
                .analise(dto.getAnalise())
                .build();
    }
}
