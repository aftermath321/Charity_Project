package pl.coderslab.charity.Services;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.Entity.Category;
import pl.coderslab.charity.Repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServices {

    private final CategoryRepository categoryRepository;


    public CategoryServices(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategories (){
        return categoryRepository.findAll();
    }

}
