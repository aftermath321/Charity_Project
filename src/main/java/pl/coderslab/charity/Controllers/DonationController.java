package pl.coderslab.charity.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.coderslab.charity.Entity.Category;
import pl.coderslab.charity.Repository.InstitutionRepository;
import pl.coderslab.charity.Services.CategoryServices;
import pl.coderslab.charity.Services.DonationServices;
import pl.coderslab.charity.Services.InstitutionServices;

import java.util.List;

@Controller
public class DonationController {

    final private CategoryServices categoryServices;
    final private DonationServices donationServices;
    final private InstitutionServices institutionServices;

    public DonationController(CategoryServices categoryServices, DonationServices donationServices, InstitutionServices institutionServices, InstitutionRepository institutionRepository) {
        this.categoryServices = categoryServices;
        this.donationServices = donationServices;
        this.institutionServices = institutionServices;
    }

    @GetMapping("/addDonation")
    public String addDonation (){

        return "form";
    }

    @ModelAttribute("categories")
    public List<Category> categoryList(){
        return categoryServices.getCategories();
    }
}
