package app.weather.local.core.repository;

import app.weather.local.core.document.Usuario;
import app.weather.local.core.document.enums.EAnalise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocalRepository extends MongoRepository<Usuario,String> {
    List<Usuario> findByAnalise(EAnalise eAnalise);
}
