package weatherapp.dtos;

import java.time.LocalDateTime;

import weatherapp.entities.Locations;
import weatherapp.entities.enums.Condition;

public record WeatherForecastsCreateDto(
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
