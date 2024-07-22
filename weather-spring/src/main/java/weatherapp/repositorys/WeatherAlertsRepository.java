package weatherapp.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.WeatherAlerts;

@Repository
public interface WeatherAlertsRepository extends JpaRepository<WeatherAlerts, UUID> {

}
