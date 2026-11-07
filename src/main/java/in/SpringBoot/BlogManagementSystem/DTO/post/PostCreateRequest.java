package in.SpringBoot.BlogManagementSystem.DTO.post;

import in.SpringBoot.BlogManagementSystem.Entity.PostStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostCreateRequest {
    @NotBlank
    @Size(max = 200)
    private String title;

    @NotBlank
    private String content;

    @NotNull
    private PostStatus status;

    @NotNull
    private UUID categoryId;

    @NotNull
    @Size(max = 50)
    private Set<@NotNull UUID> tagIds;
}
