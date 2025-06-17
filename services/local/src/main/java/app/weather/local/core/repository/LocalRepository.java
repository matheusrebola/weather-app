package app.weather.local.core.repository;

import app.weather.local.core.document.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepository extends MongoRepository<Usuario,String> {
}
