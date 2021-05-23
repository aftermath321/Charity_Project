package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.Repository.DonationRepository;

@Service
public class DonationServices {

    private final DonationRepository donationRepository;

    public DonationServices(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

}
