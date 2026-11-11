package in.SpringBoot.BlogManagementSystem.Service;

import in.SpringBoot.BlogManagementSystem.DTO.category.CategoryResponse;
import in.SpringBoot.BlogManagementSystem.Entity.Category;

import java.util.List;

public interface CategoryService {
    List<CategoryResponse> listCategories();
}
