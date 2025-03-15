package com.example.gestaotreinamentos.infra.repository.user;

import com.example.gestaotreinamentos.infra.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    UserDetails findByUserId(Long userId);
    UserDetails findByEmail(String email);
}
