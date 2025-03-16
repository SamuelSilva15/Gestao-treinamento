package com.example.gestaotreinamentos.application.usecaseimpl.token.generate;

import com.example.gestaotreinamentos.application.gateway.token.TokenGateway;
import com.example.gestaotreinamentos.infra.entity.user.User;
import com.example.gestaotreinamentos.usecase.token.generate.GenerateTokenUsecase;

public class GenerateTokenUsecaseImpl implements GenerateTokenUsecase {

    private final TokenGateway tokenGateway;

    public GenerateTokenUsecaseImpl(TokenGateway tokenGateway) {
        this.tokenGateway = tokenGateway;
    }

    @Override
    public String execute(User user) {
        return tokenGateway.execute(user);
    }
}
