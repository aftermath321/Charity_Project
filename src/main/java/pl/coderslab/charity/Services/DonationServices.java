package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.Entity.Donation;
import pl.coderslab.charity.Repository.DonationRepository;

import java.util.List;

@Service
public class DonationServices {

    private final DonationRepository donationRepository;

    public DonationServices(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Integer countQuantity (){
        return donationRepository.quantitySum().get();
    }

    public int countDonations (){
        List<Donation> list = donationRepository.findAll();
        return list.size();
    }

    public void save (Donation donation){
        donationRepository.save(donation);
    }
}
