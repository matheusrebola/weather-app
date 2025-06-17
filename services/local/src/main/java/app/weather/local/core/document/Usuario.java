package app.weather.local.core.document;

import app.weather.local.core.document.enums.EAnalise;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "usuarios")
@Data
@Builder
public class Usuario {
    @Id
    private String id;
    private List<Local> local;
    private Dispositivo dispositivo;
    private EAnalise analise;
}
