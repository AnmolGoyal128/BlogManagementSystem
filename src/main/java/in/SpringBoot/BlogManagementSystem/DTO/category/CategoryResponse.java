package in.SpringBoot.BlogManagementSystem.DTO.category;

import lombok.*;

import java.util.UUID;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryResponse {
    private UUID id;
    private String name;
    private long postCount;
}
