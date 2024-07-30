package weatherapp.dtos;

import weatherapp.entities.TemperatureUnit;
import weatherapp.entities.WindSpeedUnit;

public record PreferencesCreateDto(
		TemperatureUnit temperatureUnit,
		WindSpeedUnit windSpeedUnit,
		String otherPreferences) {

}
