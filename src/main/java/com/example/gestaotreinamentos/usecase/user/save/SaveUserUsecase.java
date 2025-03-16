package com.example.gestaotreinamentos.usecase.user.save;

import com.example.gestaotreinamentos.core.domain.user.RegisterDTO;
import com.example.gestaotreinamentos.infra.entity.user.User;

public interface SaveUserUsecase {
    User execute(RegisterDTO registerDTO);
}
