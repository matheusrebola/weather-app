package weatherapp.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import weatherapp.entities.Locations;
import weatherapp.entities.Preferences;

public record UsersDto(
		@NotNull UUID id,
		String username,
		String email,
		String password,
		Locations location,
		Preferences preference) {

}
