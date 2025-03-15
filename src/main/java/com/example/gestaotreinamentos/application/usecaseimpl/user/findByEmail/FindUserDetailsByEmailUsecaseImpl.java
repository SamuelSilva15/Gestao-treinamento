package com.example.gestaotreinamentos.application.usecaseimpl.user.findByEmail;

import com.example.gestaotreinamentos.application.gateway.user.UserGateway;
import com.example.gestaotreinamentos.usecase.user.findByEmail.FindUserDetailsByEmailUsecase;
import org.springframework.security.core.userdetails.UserDetails;

public class FindUserDetailsByEmailUsecaseImpl implements FindUserDetailsByEmailUsecase {

    private final UserGateway userGateway;

    public FindUserDetailsByEmailUsecaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public UserDetails execute(String email) {
        return userGateway.findByEmail(email);
    }
}
