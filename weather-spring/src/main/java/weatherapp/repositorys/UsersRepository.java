package weatherapp.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weatherapp.entities.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, UUID> {

}
