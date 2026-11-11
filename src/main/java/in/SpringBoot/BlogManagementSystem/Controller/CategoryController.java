package in.SpringBoot.BlogManagementSystem.Controller;

import in.SpringBoot.BlogManagementSystem.DTO.category.CategoryCreateRequest;
import in.SpringBoot.BlogManagementSystem.DTO.category.CategoryResponse;
import in.SpringBoot.BlogManagementSystem.Entity.Category;
import in.SpringBoot.BlogManagementSystem.Repository.CategoryRepository;
import in.SpringBoot.BlogManagementSystem.Service.CategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> ListCategory(){
        // TODO
        List<CategoryResponse> categories = categoryService.listCategories();

        return ResponseEntity.ok(categories);

    }
    @PostMapping
    public ResponseEntity<CategoryCreateRequest> createCategory(@Valid @RequestBody
                                                                CategoryCreateRequest categoryCreateRequest){
        // TODO
        return ResponseEntity.ok(categoryCreateRequest);
    }

}
