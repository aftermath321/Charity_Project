package pl.coderslab.charity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.Entity.Institution;

import java.util.List;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {


}
