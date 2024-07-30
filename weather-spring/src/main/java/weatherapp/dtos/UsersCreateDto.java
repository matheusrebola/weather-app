package weatherapp.dtos;

import weatherapp.entities.Locations;
import weatherapp.entities.Preferences;

public record UsersCreateDto(
		String username,
		String email,
		String password,
		Locations location,
		Preferences preference) {

}
