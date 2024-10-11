package weatherapp.dtos;

import weatherapp.entities.enums.TemperatureUnit;
import weatherapp.entities.enums.WindSpeedUnit;

public record PreferencesCreateDto(
		TemperatureUnit temperatureUnit,
		WindSpeedUnit windSpeedUnit,
		String otherPreferences) {

}
