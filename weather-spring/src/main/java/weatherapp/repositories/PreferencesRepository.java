package weatherapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Preferences;
import weatherapp.entities.enums.TemperatureUnit;
import weatherapp.entities.enums.WindSpeedUnit;

@Repository
public interface PreferencesRepository extends JpaRepository<Preferences, UUID> {
  public Preferences findByTemperatureUnit(TemperatureUnit temperatureUnit);
  public Preferences findByWindSpeedUnit(WindSpeedUnit windSpeedUnit);
  public Preferences findByOtherPreferences(String otherPreferences);
}
