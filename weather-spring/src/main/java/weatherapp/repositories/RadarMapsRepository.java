package weatherapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.RadarMaps;

@Repository
public interface RadarMapsRepository extends JpaRepository<RadarMaps, UUID> {

}
