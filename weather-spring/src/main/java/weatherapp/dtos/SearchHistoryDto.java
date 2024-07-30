package weatherapp.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import weatherapp.entities.Locations;
import weatherapp.entities.Users;

public record SearchHistoryDto(
		@NotNull UUID id,
		LocalDateTime searchTimestamp,
		Users user,
		Locations location) {

}
