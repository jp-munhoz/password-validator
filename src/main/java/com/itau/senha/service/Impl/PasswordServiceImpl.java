package com.itau.senha.service.Impl;

import com.itau.senha.service.PasswordService;
import org.passay.*;
import org.springframework.stereotype.Service;

@Service
public class PasswordServiceImpl implements PasswordService {

    @Override
    public boolean isValid(String password) {
        PasswordValidator validator = new PasswordValidator(
                new LengthRule(9, 30),
                new CharacterRule(EnglishCharacterData.UpperCase, 1),
                new CharacterRule(EnglishCharacterData.LowerCase, 1),
                new CharacterRule(EnglishCharacterData.Digit, 1),
                new CharacterRule(EnglishCharacterData.Special, 1),
                new WhitespaceRule(),
                new IllegalRegexRule("(?i)([!@#$%^&*()-+]|[A-Za-z]|[0-9])(?=.*\\1)")
        );

        RuleResult result = validator.validate(new PasswordData(password));

        return result.isValid();
    }
}

