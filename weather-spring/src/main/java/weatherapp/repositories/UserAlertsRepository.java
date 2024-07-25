package weatherapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.UserAlerts;

@Repository
public interface UserAlertsRepository extends JpaRepository<UserAlerts, UUID> {

}
