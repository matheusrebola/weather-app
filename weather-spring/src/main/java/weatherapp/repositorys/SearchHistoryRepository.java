package weatherapp.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.SearchHistory;

@Repository
public interface SearchHistoryRepository extends JpaRepository<SearchHistory, UUID> {

}
