package danielle.soares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import danielle.soares.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
