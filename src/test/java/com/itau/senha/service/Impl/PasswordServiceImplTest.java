package com.itau.senha.service.Impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordServiceImplTest {


    @Test
    public void numberOfCharacteres(){
        PasswordServiceImpl service = new PasswordServiceImpl();
        boolean valid = service.isValid("Qwerty1@");
        assertFalse(valid);
    }

    @Test
    public void AtLeastOneDigit(){
        PasswordServiceImpl service = new PasswordServiceImpl();
        boolean valid = service.isValid("Qwerty!@#");
        assertFalse(valid);
    }

    @Test
    public void AtLeastOneCapitalLetter(){
        PasswordServiceImpl service = new PasswordServiceImpl();
        boolean valid = service.isValid("qwerty!@9");
        assertFalse(valid);
    }

    @Test
    public void AtLeastOneSpecialCharacter(){
        PasswordServiceImpl service = new PasswordServiceImpl();
        boolean valid = service.isValid("Qwerty123");
        assertFalse(valid);
    }

    @Test
    public void NoRepeatedCharactersInTheSet(){
        PasswordServiceImpl service = new PasswordServiceImpl();
        boolean valid = service.isValid("Qwerty@12q");
        assertFalse(valid);
    }

    @Test
    public void validPassword(){
        PasswordServiceImpl service = new PasswordServiceImpl();
        boolean valid = service.isValid("Qwerty@1234");
        assertTrue(valid);
    }
}