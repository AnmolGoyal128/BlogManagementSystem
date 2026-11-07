package in.SpringBoot.BlogManagementSystem.Repository;

import in.SpringBoot.BlogManagementSystem.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
