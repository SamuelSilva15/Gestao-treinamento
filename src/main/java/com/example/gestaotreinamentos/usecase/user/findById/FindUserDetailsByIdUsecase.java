package com.example.gestaotreinamentos.usecase.user.findById;

import org.springframework.security.core.userdetails.UserDetails;

public interface FindUserDetailsByIdUsecase {
    UserDetails findById(Long userId);
}
