package app.weather.local.core.dto;

import lombok.Data;

@Data
public class DispositivoDTO {
    private String modelo;
    private String mac;
    private String token;
}
