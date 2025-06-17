package app.weather.local.core.mapper;

import app.weather.local.core.document.Dispositivo;
import app.weather.local.core.document.Usuario;
import app.weather.local.core.dto.DispositivoDTO;
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

    public Usuario map(Usuario usuario, DispositivoDTO dto) {
        return Usuario.builder()
                .id(usuario.getId())
                .local(usuario.getLocal())
                .dispositivo(map(dto))
                .build();
    }

    public Dispositivo map(DispositivoDTO dto){
        return Dispositivo.builder()
                .modelo(dto.getModelo())
                .mac(dto.getMac())
                .token(dto.getToken())
                .build();
    }
}
