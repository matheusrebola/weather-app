package weatherapp.repositories;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Locations;
import weatherapp.entities.LongTermForecasts;

@Repository
public interface LongTermForecastsRepository extends JpaRepository<LongTermForecasts, UUID> {
  public List<LongTermForecasts> findByStartDate(LocalDateTime startDate);
  public List<LongTermForecasts> findByEndDate(LocalDateTime endDate);
  public LongTermForecasts findBySummary(String summary);
  public List<LongTermForecasts> findByLocations(Locations location);
}
