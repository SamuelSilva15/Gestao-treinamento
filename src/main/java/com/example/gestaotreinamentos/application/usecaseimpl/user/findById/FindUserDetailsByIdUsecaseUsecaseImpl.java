package com.example.gestaotreinamentos.application.usecaseimpl.user.findById;

import com.example.gestaotreinamentos.application.gateway.user.UserGateway;
import com.example.gestaotreinamentos.infra.entity.user.User;
import com.example.gestaotreinamentos.usecase.user.findById.FindUserDetailsByIdUsecase;

import java.util.Optional;

public class FindUserDetailsByIdUsecaseUsecaseImpl implements FindUserDetailsByIdUsecase {

    private final UserGateway userGateway;

    public FindUserDetailsByIdUsecaseUsecaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public Optional<User> findById(Long userId) {
        return userGateway.findById(userId);
    }
}
