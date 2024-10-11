package weatherapp.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import weatherapp.entities.Locations;
import weatherapp.entities.enums.Condition;

public record WeatherForecastsDto(
		@NotNull UUID id,
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
