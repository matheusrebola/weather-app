package weatherapp.repositories;

import java.util.UUID;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Locations;
import weatherapp.entities.WeatherAlerts;
import weatherapp.entities.enums.AlertType;

@Repository
public interface WeatherAlertsRepository extends JpaRepository<WeatherAlerts, UUID> {
  public List<WeatherAlerts> findByAlertType(AlertType alertType);
  public WeatherAlerts findByDescription(String description);
  public List<WeatherAlerts> findByStartTime(LocalDateTime starTime);
  public List<WeatherAlerts> findByEndTime(LocalDateTime endTime);
  public List<WeatherAlerts> findByLocation(Locations location);
}
