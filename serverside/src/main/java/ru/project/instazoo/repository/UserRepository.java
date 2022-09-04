package ru.project.instazoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.instazoo.entity.Users;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    Optional<Users> findUsersByUsername(String username);

    Optional<Users> findUsersByEmail(String email);

    Optional<Users> findUsersById(Long id);

}
