package com.example.gestaotreinamentos.application.usecaseimpl.user.save;

import com.example.gestaotreinamentos.application.gateway.user.UserGateway;
import com.example.gestaotreinamentos.infra.entity.user.User;
import com.example.gestaotreinamentos.usecase.user.save.SaveUserUsecase;

public class SaveUserUsecaseImpl implements SaveUserUsecase {

    private final UserGateway userGateway;

    public SaveUserUsecaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public void execute(User user) {
        this.userGateway.save(user);
    }
}
