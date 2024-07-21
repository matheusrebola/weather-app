package weatherapp.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record UserAlerts(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Boolean isRead,
		Users user,
		WeatherAlerts weatherAlerts) {

}
