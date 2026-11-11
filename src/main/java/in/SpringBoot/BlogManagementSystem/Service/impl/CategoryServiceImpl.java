package in.SpringBoot.BlogManagementSystem.Service.impl;

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
}
