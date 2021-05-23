package pl.coderslab.charity.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.Entity.Institution;
import pl.coderslab.charity.Repository.InstitutionRepository;
import pl.coderslab.charity.Services.CategoryServices;
import pl.coderslab.charity.Services.DonationServices;
import pl.coderslab.charity.Services.InstitutionServices;

import java.util.List;


@Controller
public class HomeController {

    final private CategoryServices categoryServices;
    final private DonationServices donationServices;
    final private InstitutionServices institutionServices;

    public HomeController(CategoryServices categoryServices, DonationServices donationServices, InstitutionServices institutionServices, InstitutionRepository institutionRepository) {
        this.categoryServices = categoryServices;
        this.donationServices = donationServices;
        this.institutionServices = institutionServices;
    }

    @RequestMapping("/")
    public String homeAction(Model model){
        return "index";
    }

    @ModelAttribute("institutions")
    public List<Institution> institutionList () {
        return institutionServices.getInstitutionList();
    }
}
