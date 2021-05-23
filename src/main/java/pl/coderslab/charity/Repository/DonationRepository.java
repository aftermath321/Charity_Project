package pl.coderslab.charity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.Entity.Donation;
import pl.coderslab.charity.Entity.Institution;

public interface DonationRepository extends JpaRepository<Donation, Long> {
}
