package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.Entity.Institution;
import pl.coderslab.charity.Repository.InstitutionRepository;

import java.util.List;

@Service
public class InstitutionServices {

    private final InstitutionRepository institutionRepository;


    public InstitutionServices(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }

    public List<Institution> getInstitutionList() {
        return institutionRepository.findAll();
    }


}
