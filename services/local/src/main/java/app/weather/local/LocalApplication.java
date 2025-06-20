package app.weather.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalApplication.class, args);
	}

}
