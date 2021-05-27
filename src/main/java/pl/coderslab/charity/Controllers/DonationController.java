package pl.coderslab.charity.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.Entity.Category;
import pl.coderslab.charity.Entity.Donation;
import pl.coderslab.charity.Entity.Institution;
import pl.coderslab.charity.Repository.InstitutionRepository;
import pl.coderslab.charity.Services.CategoryServices;
import pl.coderslab.charity.Services.DonationServices;
import pl.coderslab.charity.Services.InstitutionServices;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class DonationController {

    final private CategoryServices categoryServices;
    final private DonationServices donationServices;
    final private InstitutionServices institutionServices;

    public DonationController(CategoryServices categoryServices, DonationServices donationServices, InstitutionServices institutionServices, InstitutionRepository institutionRepository) {
        this.categoryServices = categoryServices;
        this.donationServices = donationServices;
        this.institutionServices = institutionServices;
    }

    @GetMapping("/add")
    public String addDonation (Model model){
        Donation donation = new Donation();
        model.addAttribute("donation", donation);
        return "form";
    }

    @PostMapping("/add")
    public String procesDonationForm(@Valid Donation donation, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        donationServices.save(donation);
        return "form-confirmation";
    }

    @ModelAttribute("categories")
    public List<Category> categoryList(){
        return categoryServices.getCategories();
    }

    @ModelAttribute("institutions")
    public List<Institution> institutions(){
        return institutionServices.getInstitutionList();
    }
}
