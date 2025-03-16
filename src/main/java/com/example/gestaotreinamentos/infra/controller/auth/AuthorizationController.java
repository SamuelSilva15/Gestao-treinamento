package com.example.gestaotreinamentos.infra.controller.auth;

import com.example.gestaotreinamentos.core.domain.user.AuthorizationDTO;
import com.example.gestaotreinamentos.core.domain.user.LoginResponseDTO;
import com.example.gestaotreinamentos.core.domain.user.RegisterDTO;
import com.example.gestaotreinamentos.infra.entity.user.User;
import com.example.gestaotreinamentos.usecase.token.generate.GenerateTokenUsecase;
import com.example.gestaotreinamentos.usecase.user.findByEmail.FindUserDetailsByEmailUsecase;
import com.example.gestaotreinamentos.usecase.user.save.SaveUserUsecase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("api/v1/auth")
public class AuthorizationController {

    private final AuthenticationManager authenticationManager;
    private final SaveUserUsecase saveUserUsecase;
    private final GenerateTokenUsecase generateTokenUsecase;
    private final FindUserDetailsByEmailUsecase findUserDetailsByEmailUsecase;

    public AuthorizationController(AuthenticationManager authenticationManager, SaveUserUsecase saveUserUsecase, GenerateTokenUsecase generateTokenUsecase, FindUserDetailsByEmailUsecase findUserDetailsByEmailUsecase) {
        this.authenticationManager = authenticationManager;
        this.saveUserUsecase = saveUserUsecase;
        this.generateTokenUsecase = generateTokenUsecase;
        this.findUserDetailsByEmailUsecase = findUserDetailsByEmailUsecase;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody @Validated AuthorizationDTO data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = generateTokenUsecase.execute((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity<User> authorize(@RequestBody @Validated RegisterDTO registerDTO) {
        try {
            if(Objects.nonNull(this.findUserDetailsByEmailUsecase.execute(registerDTO.email()))) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
            }

            User userSaved = this.saveUserUsecase.execute(registerDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body(userSaved);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
