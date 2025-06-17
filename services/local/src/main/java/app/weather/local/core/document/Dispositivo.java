package app.weather.local.core.document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Dispositivo {
    private String modelo;
    private String mac;
    private String token;
}
