package com.example.gestaotreinamentos.usecase.user.findById;

import com.example.gestaotreinamentos.infra.entity.user.User;

import java.util.Optional;

public interface FindUserDetailsByIdUsecase {
    Optional<User> findById(Long userId);
}
