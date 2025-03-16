package com.example.gestaotreinamentos.application.usecaseimpl.token.validate;

import com.example.gestaotreinamentos.application.gateway.token.TokenGateway;
import com.example.gestaotreinamentos.usecase.token.validate.ValidateTokenUsecase;

public class ValidateTokenUsecaseImpl implements ValidateTokenUsecase {

    private final TokenGateway tokenGateway;

    public ValidateTokenUsecaseImpl(TokenGateway tokenGateway) {
        this.tokenGateway = tokenGateway;
    }

    @Override
    public String execute(String token) {
        return tokenGateway.validate(token);
    }
}
