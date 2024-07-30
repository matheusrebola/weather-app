package weatherapp.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import weatherapp.entities.Users;
import weatherapp.entities.WeatherAlerts;

public record UserAlertsDto(
		@NotNull UUID id,
		Boolean isRead,
		Users user,
		WeatherAlerts weatherAlerts) {

}
