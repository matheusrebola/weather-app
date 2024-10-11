package weatherapp.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import weatherapp.entities.enums.TemperatureUnit;
import weatherapp.entities.enums.WindSpeedUnit;

@Entity
public record Preferences(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		TemperatureUnit temperatureUnit,
		WindSpeedUnit windSpeedUnit,
		String otherPreferences) {

}
