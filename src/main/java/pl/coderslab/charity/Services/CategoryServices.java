package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.Repository.CategoryRepository;

@Service
public class CategoryServices {

    private final CategoryRepository categoryRepository;


    public CategoryServices(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
