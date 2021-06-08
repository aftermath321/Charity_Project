package pl.coderslab.charity;

import org.springframework.core.convert.converter.Converter;
import pl.coderslab.charity.Entity.Institution;


public class StringToInstitutionConverter implements Converter<String, Institution> {



    @Override
    public Institution convert (String source){
        return new Institution(Long.parseLong(source), "", "");
    }
}
