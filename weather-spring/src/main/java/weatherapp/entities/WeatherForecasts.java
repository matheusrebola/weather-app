package weatherapp.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import weatherapp.entities.enums.Condition;

@Entity
public record WeatherForecasts(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime date,
		Float temperatureCurrent,
		Float temperatureMax,
		Float temperatureMin,
		Condition condition,
		Float humidity,
		Float windSpeed,
		Float visibility,
		Locations location) {

}
