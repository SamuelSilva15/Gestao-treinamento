package com.example.gestaotreinamentos.infra.service.user;

import com.example.gestaotreinamentos.application.gateway.user.UserGateway;
import com.example.gestaotreinamentos.core.domain.user.RegisterDTO;
import com.example.gestaotreinamentos.infra.entity.user.User;
import com.example.gestaotreinamentos.infra.repository.user.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserGatewayImpl implements UserGateway {

    private final UserRepository userRepository;

    public UserGatewayImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findById(Long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public UserDetails findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User save(RegisterDTO registerDTO) {
        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDTO.password());
        User user = new User(registerDTO.name(), registerDTO.email(), encryptedPassword, registerDTO.role());
        return this.userRepository.save(user);
    }
}
