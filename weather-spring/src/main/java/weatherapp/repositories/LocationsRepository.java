package weatherapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Locations;

@Repository
public interface LocationsRepository extends JpaRepository<Locations, UUID> {

}
