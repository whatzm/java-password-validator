package password_validator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class PasswordValidator {

    public boolean hasMinLength(String password) {
        return password.length() >= PasswordRules.MIN_LENGTH;
    }

    public boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (PasswordRules.SPECIAL_CHARACTERS.contains(currentChar)) {
                return true;
            }
        }
        return false;
    }

    public List<PasswordError> getErrors(String password) {
        List<PasswordError> errors = new ArrayList<>();

        Map<PasswordError, Predicate<String>> rules = Map.of(
                PasswordError.TOO_SHORT, this::hasMinLength,
                PasswordError.NO_DIGIT, this::hasDigit,
                PasswordError.NO_UPPERCASE, this::hasUpperCase,
                PasswordError.NO_LOWERCASE, this::hasLowerCase,
                PasswordError.NO_SPECIAL_CHARACTER, this::hasSpecialCharacter
        );

        for (Map.Entry<PasswordError, Predicate<String>> rule : rules.entrySet()) {
            if (!rule.getValue().test(password)) {
                errors.add(rule.getKey());
            }
        }

        return errors;
    }
}
