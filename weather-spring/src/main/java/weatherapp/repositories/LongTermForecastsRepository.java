package weatherapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.LongTermForecasts;

@Repository
public interface LongTermForecastsRepository extends JpaRepository<LongTermForecasts, UUID> {

}
