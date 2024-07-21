package weatherapp.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Locations(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String city,
		String region,
		String country,
		String latitude,
		String longitude) {

}
