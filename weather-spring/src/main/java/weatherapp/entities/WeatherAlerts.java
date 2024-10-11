package weatherapp.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import weatherapp.entities.enums.AlertType;

@Entity
public record WeatherAlerts(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		AlertType alertType,
		String description,
		LocalDateTime startTime,
		LocalDateTime endTime,
		Locations location) {

}
