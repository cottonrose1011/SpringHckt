package helloSpringHckt.Repository;

import helloSpringHckt.Domain.siteUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<siteUser,Long> {
    Optional<siteUser> findByusername(String username);
}
