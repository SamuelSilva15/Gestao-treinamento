package com.example.gestaotreinamentos.application.gateway.user;

import com.example.gestaotreinamentos.infra.entity.user.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserGateway {
    UserDetails findById(Long userId);
    UserDetails findByEmail(String email);
    void save(User user);
}
