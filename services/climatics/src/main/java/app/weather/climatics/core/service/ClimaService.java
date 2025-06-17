package app.weather.climatics.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ClimaService {

    private final RestTemplate restTemplate;

    @Value("${spring.weather.api.key}")
    private String apiKey;

    @Value("${spring.weather.api.url}")
    private String apiUrl;

    public void getCurrentWeather(Coordinates coordinates) {
        try {
            String url = buildWeatherUrl(coordinates);

            ResponseEntity<WeatherResponse> response = restTemplate.getForEntity(
                    url,
                    WeatherResponse.class
            );

            if (response.getStatusCode().is2xxSuccessful()) {
                return response.getBody();
            } else {
                throw new RuntimeException("Erro ao consultar API de clima: " + response.getStatusCode());
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao consumir API de clima", e);
        }
    }

    private String buildWeatherUrl(Coordinates coordinates) {
        return String.format("%s?key=%s&q=%s,%s",
                apiUrl,
                apiKey,
                coordinates.getLatitude(),
                coordinates.getLongitude()
        );
    }
}