package danielle.soares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import danielle.soares.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
