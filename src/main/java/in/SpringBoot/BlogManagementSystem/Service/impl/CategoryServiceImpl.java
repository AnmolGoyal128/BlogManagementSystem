package in.SpringBoot.BlogManagementSystem.Service.impl;

import in.SpringBoot.BlogManagementSystem.DTO.category.CategoryCreateRequest;
import in.SpringBoot.BlogManagementSystem.DTO.category.CategoryResponse;
import in.SpringBoot.BlogManagementSystem.Entity.Category;
import in.SpringBoot.BlogManagementSystem.Repository.CategoryRepository;
import in.SpringBoot.BlogManagementSystem.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryResponse> listCategories() {
        return categoryRepository.findAllWithPostCount();
    }

    @Override
    public CategoryCreateRequest createCategory(CategoryCreateRequest categoryCreateRequest) {
        String categoryName = categoryCreateRequest.getName();
        if (categoryRepository.existsByNameIgnoreCase(categoryName)) {
            throw new IllegalArgumentException("Category with name '" + categoryName + "' already exists.");
        }
        return categoryRepository.save(CategoryCreateRequest);
    }
}
