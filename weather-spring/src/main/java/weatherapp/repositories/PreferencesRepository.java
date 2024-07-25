package weatherapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Preferences;

@Repository
public interface PreferencesRepository extends JpaRepository<Preferences, UUID> {

}
