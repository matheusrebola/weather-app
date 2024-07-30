package weatherapp.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record RadarMapsDto(
		@NotNull UUID id,
		String locationId,
		LocalDateTime timestamp,
		String mapData) {

}
