package com.example.gestaotreinamentos.usecase.user.findByEmail;

import org.springframework.security.core.userdetails.UserDetails;

public interface FindUserDetailsByEmailUsecase {
    UserDetails execute(String email);
}
