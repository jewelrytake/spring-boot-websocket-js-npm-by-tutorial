package jewelry.socketDemo.repository;

import jewelry.socketDemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<User, String> {
}
