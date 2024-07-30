package weatherapp.dtos;

import java.time.LocalDateTime;

public record RadarMapsCreateDto(
		String locationId,
		LocalDateTime timestamp,
		String mapData) {

}
