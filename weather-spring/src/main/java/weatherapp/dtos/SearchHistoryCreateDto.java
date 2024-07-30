package weatherapp.dtos;

import java.time.LocalDateTime;

import weatherapp.entities.Locations;
import weatherapp.entities.Users;

public record SearchHistoryCreateDto(
		LocalDateTime searchTimestamp,
		Users user,
		Locations location) {

}
