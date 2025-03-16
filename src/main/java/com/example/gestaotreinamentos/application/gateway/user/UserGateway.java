package com.example.gestaotreinamentos.application.gateway.user;

import com.example.gestaotreinamentos.core.domain.user.RegisterDTO;
import com.example.gestaotreinamentos.infra.entity.user.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserGateway {
    Optional<User> findById(Long userId);
    UserDetails findByEmail(String email);
    User save(RegisterDTO registerDTO);
}
