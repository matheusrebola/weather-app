package weatherapp.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import weatherapp.entities.enums.TemperatureUnit;
import weatherapp.entities.enums.WindSpeedUnit;

public record PreferencesDto(
		@NotNull UUID id,
		TemperatureUnit temperatureUnit,
		WindSpeedUnit windSpeedUnit,
		String otherPreferences) {

}
