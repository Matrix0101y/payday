package az.express.data.repository;

import az.express.data.entity.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStatusRepositry extends JpaRepository<UserStatus,Long> {
    UserStatus findUserStatusById(Long id);
}
