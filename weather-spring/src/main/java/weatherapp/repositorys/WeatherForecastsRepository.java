package weatherapp.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.WeatherForecasts;

@Repository
public interface WeatherForecastsRepository extends JpaRepository<WeatherForecasts, UUID> {

}
