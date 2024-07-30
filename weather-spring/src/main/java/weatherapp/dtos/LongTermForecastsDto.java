package weatherapp.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import weatherapp.entities.Locations;

public record LongTermForecastsDto(
		@NotNull UUID id,
		LocalDateTime startDate,
		LocalDateTime endDate,
		String summary,
		Locations location) {

}
