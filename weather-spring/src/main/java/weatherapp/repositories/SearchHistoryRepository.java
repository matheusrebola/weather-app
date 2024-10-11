package weatherapp.repositories;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Locations;
import weatherapp.entities.SearchHistory;
import weatherapp.entities.Users;

@Repository
public interface SearchHistoryRepository extends JpaRepository<SearchHistory, UUID> {
  public SearchHistory findBySearchTimeStamp(LocalDateTime searchTimeStamp);
  public SearchHistory findByUser(Users user);
  public List<SearchHistory> findByLocations(Locations location);
}
