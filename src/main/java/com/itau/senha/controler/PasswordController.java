package com.itau.senha.controler;

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
    public ResponseEntity<Boolean> isValid(@RequestBody String password){
        boolean pw = service.isValid(password);

        if (pw){
            return ResponseEntity.accepted().body(true);
        } else {
            return ResponseEntity.badRequest().body(false);
        }
    }
}
