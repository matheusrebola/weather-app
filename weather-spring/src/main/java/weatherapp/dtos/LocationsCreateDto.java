package weatherapp.dtos;

public record LocationsCreateDto(
		String city,
		String region,
		String country,
		String latitude,
		String longitude) {

}
