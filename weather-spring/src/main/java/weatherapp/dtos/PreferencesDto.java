package weatherapp.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import weatherapp.entities.TemperatureUnit;
import weatherapp.entities.WindSpeedUnit;

public record PreferencesDto(
		@NotNull UUID id,
		TemperatureUnit temperatureUnit,
		WindSpeedUnit windSpeedUnit,
		String otherPreferences) {

}
