package weatherapp.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import weatherapp.entities.Locations;
import weatherapp.entities.enums.AlertType;

public record WeatherAlertsDto(
		@NotNull UUID id,
		AlertType alertType,
		String description,
		LocalDateTime startTime,
		LocalDateTime endTime,
		Locations location) {

}
