package weatherapp.dtos;

import java.time.LocalDateTime;

import weatherapp.entities.Locations;

public record LongTermCreateDto(
		LocalDateTime startDate,
		LocalDateTime endDate,
		String summary,
		Locations location) {

}
