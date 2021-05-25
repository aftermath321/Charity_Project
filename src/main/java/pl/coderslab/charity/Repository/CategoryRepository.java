package pl.coderslab.charity.Repository;

import org.hibernate.secure.spi.JaccPermissionDeclarations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
