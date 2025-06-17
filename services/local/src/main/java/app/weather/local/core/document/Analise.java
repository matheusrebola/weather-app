package app.weather.local.core.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "analise")
@Data
@Builder
public class Analise {
    @Id
    private String id;
    private List<Usuario> usuarios;
}
