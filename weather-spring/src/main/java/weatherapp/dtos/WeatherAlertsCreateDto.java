package weatherapp.dtos;

import java.time.LocalDateTime;

import weatherapp.entities.AlertType;
import weatherapp.entities.Locations;

public record WeatherAlertsCreateDto(
		AlertType alertType,
		String description,
		LocalDateTime startTime,
		LocalDateTime endTime,
		Locations location) {

}
