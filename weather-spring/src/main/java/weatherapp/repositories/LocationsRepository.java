package weatherapp.repositories;

import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Locations;

@Repository
public interface LocationsRepository extends JpaRepository<Locations, UUID> {
  public List<Locations> findByCity(String city);
  public Locations findByRegion(String region);
  public Locations findByCountry(String country);
  public Locations findByLatitude(String latitude);
  public Locations findByLongitude(String longitude);
}
