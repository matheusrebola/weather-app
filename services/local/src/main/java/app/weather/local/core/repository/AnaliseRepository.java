package app.weather.local.core.repository;

import app.weather.local.core.document.Analise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnaliseRepository extends MongoRepository<Analise,String> {
    void deleteUsuariosById(String id);
}
