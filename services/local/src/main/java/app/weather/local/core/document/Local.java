package app.weather.local.core.document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Local {
    private String latitude;
    private String longitude;
}
