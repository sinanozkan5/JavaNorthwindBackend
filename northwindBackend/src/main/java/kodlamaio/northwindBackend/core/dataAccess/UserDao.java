package kodlamaio.northwindBackend.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwindBackend.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer>{
	User findByEmail(String email);
}