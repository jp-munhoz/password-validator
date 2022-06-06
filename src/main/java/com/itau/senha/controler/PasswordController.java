package com.itau.senha.controler;

import com.itau.senha.model.Password;
import com.itau.senha.service.Impl.PasswordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("password")
public class PasswordController {

    @Autowired
    PasswordServiceImpl service;

    @PostMapping("/isValid")
    public ResponseEntity<Boolean> isValid(@RequestBody Password password){
        boolean pw = service.isValid(password.getPassword());

        System.out.println("PasswordController.isValid: Validando senha do usuário. . .");

        if (pw){
            System.out.println("PasswordController.isValid: Senha atende todos os critérios");
            return ResponseEntity.accepted().body(true);
        } else {
            System.out.println("PasswordController.isValid: Senha não atende todos os critérios");
            return ResponseEntity.badRequest().body(false);
        }
    }
}
