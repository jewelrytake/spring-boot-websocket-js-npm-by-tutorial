package jewelry.socketDemo.repository;

import jewelry.socketDemo.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
