package weatherapp.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Locations;
import weatherapp.entities.Preferences;
import weatherapp.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, UUID> {
  public Users findByUsername(String userName);
  public Users findByEmail(String email);
  public List<Users> findByLocation(Locations location);
  public List<Users> findByPreferences(Preferences preference);
}
