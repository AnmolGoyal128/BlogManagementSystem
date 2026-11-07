package in.SpringBoot.BlogManagementSystem.DTO.post;

import in.SpringBoot.BlogManagementSystem.Entity.PostStatus;
import in.SpringBoot.BlogManagementSystem.DTO.category.CategoryResponse;
import in.SpringBoot.BlogManagementSystem.DTO.tag.TagResponse;
import in.SpringBoot.BlogManagementSystem.DTO.user.UserSummaryResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostResponse {
    private UUID id;
    private String title;
    private String content;
    private PostStatus status;
    private Integer readingTime;
    private LocalDateTime updatedAt;
    private LocalDateTime publishedAt;
    private UserSummaryResponse author;
    private CategoryResponse category;
    private Set<TagResponse> tags;
}
