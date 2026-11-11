package in.SpringBoot.BlogManagementSystem.Repository;

import in.SpringBoot.BlogManagementSystem.DTO.category.CategoryResponse;
import in.SpringBoot.BlogManagementSystem.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {

    @Query("SELECT c FROM Category c LEFT JOIN FETCH c.posts")
    List<CategoryResponse> findAllWithPostCount();

    boolean existsByNameIgnoreCase(String name);
}
