package weatherapp.dtos;

import java.time.LocalDateTime;

import weatherapp.entities.Locations;
import weatherapp.entities.enums.AlertType;

public record WeatherAlertsCreateDto(
		AlertType alertType,
		String description,
		LocalDateTime startTime,
		LocalDateTime endTime,
		Locations location) {

}
