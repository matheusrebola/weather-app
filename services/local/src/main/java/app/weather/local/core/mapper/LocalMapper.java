package app.weather.local.core.mapper;

import app.weather.local.core.document.Dispositivo;
import app.weather.local.core.document.Local;
import app.weather.local.core.document.Usuario;
import app.weather.local.core.dto.DispositivoDTO;
import app.weather.local.core.dto.LocalDTO;
import app.weather.local.core.dto.UsuarioDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    public Usuario map(String id, UsuarioDTO dto) {
        return Usuario.builder()
                .id(id)
                .local(dto.getLocal())
                .dispositivo(dto.getDispositivo())
                .analise(dto.getAnalise())
                .build();
    }

    public Usuario map(Usuario usuario, List<LocalDTO> dto) {
        return Usuario.builder()
                .id(usuario.getId())
                .local(dto.stream().map(local ->
                        Local.builder()
                                .latitude(local.getLatitude())
                                .longitude(local.getLongitude())
                                .build()).collect(Collectors.toList()))
                .dispositivo(usuario.getDispositivo())
                .analise(usuario.getAnalise())
                .build();
    }

    public Local map(LocalDTO dto){
        return Local.builder()
                .latitude(dto.getLatitude())
                .longitude(dto.getLongitude())
                .build();
    }

    public List<UsuarioDTO> map(List<Usuario> usuarios) {
        return usuarios.stream().map(usuario -> map(usuario)).collect(Collectors.toList());
    }

    public UsuarioDTO map(Usuario usuario){
        return UsuarioDTO.builder()
                .local(usuario.getLocal())
                .dispositivo(usuario.getDispositivo())
                .analise(usuario.getAnalise())
                .build();
    }
}
