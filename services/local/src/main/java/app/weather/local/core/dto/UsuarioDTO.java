package app.weather.local.core.dto;

import app.weather.local.core.document.Dispositivo;
import app.weather.local.core.document.Local;
import app.weather.local.core.document.enums.EAnalise;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UsuarioDTO {
    private List<Local> local;
    private Dispositivo dispositivo;
    private EAnalise analise;
}
