package weatherapp.dtos;

import weatherapp.entities.Users;
import weatherapp.entities.WeatherAlerts;

public record UserAlertsCreateDto(
		Boolean isRead,
		Users user,
		WeatherAlerts weatherAlerts) {

}
