package weatherapp.repositories;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.WeatherForecasts;

@Repository
public interface WeatherForecastsRepository extends JpaRepository<WeatherForecasts, UUID> {
  public List<WeatherForecasts> findByDate(LocalDateTime date);
  public List<WeatherForecasts> findByCurrentTemperature(Float temperatureCurrent);
}
