package pl.coderslab.charity.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.Entity.Institution;
import pl.coderslab.charity.Services.CategoryServices;
import pl.coderslab.charity.Services.DonationServices;
import pl.coderslab.charity.Services.InstitutionServices;

import java.util.List;


@Controller
@AllArgsConstructor
public class HomeController {

    final private DonationServices donationServices;
    final private InstitutionServices institutionServices;

    @RequestMapping("/")
    public String homeAction(Model model) {
        return "index";
    }

    @ModelAttribute("institutions")
    public List<Institution> institutionList() {
        return institutionServices.getInstitutionList();
    }

    @ModelAttribute("quantityCount")
    public Integer quantityCount() {
        return donationServices.countQuantity();
    }

    @ModelAttribute("donationCount")
    public int donationCount() {
        return donationServices.countDonations();
    }
}
