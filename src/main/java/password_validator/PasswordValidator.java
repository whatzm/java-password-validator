package password_validator;

import java.util.ArrayList;
import java.util.List;

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

    public boolean hasUpperCase(String password){
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasLowerCase(String password){
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSpecialCharacter(String password){
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (PasswordRules.SPECIAL_CHARACTERS.contains(currentChar)) {
                return true;
            }
        }
        return false;
    }

    public List<PasswordError> getErrors(String password){
        List<PasswordError> errors = new ArrayList<>();

        if(!hasMinLength(password)){
            errors.add(PasswordError.TOO_SHORT);
        }
        if(!hasDigit(password)){
            errors.add(PasswordError.NO_DIGIT);
        }
        if(!hasUpperCase(password)){
            errors.add(PasswordError.NO_UPPERCASE);
        }
        if(!hasLowerCase(password)){
            errors.add(PasswordError.NO_LOWERCASE);
        }
        if(!hasSpecialCharacter(password)){
            errors.add(PasswordError.NO_SPECIAL_CHARACTER);
        }

        return errors;
    }
}
