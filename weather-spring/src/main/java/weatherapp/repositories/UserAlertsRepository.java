package weatherapp.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.UserAlerts;
import weatherapp.entities.Users;
import weatherapp.entities.WeatherAlerts;

@Repository
public interface UserAlertsRepository extends JpaRepository<UserAlerts, UUID> {
  public List<UserAlerts> findByIsRead(Boolean isRead);
  public UserAlerts findByUser(Users user);
  public List<UserAlerts> findByWeatherAlerts(WeatherAlerts weatherAlerts);
}
