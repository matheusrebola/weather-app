package weatherapp.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record LocationsDto(
		@NotNull UUID id,
		String city,
		String region,
		String country,
		String latitude,
		String longitude) {

}
