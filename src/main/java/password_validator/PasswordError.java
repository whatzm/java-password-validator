package password_validator;

public enum PasswordError {
    TOO_SHORT("Password must contain at least " + PasswordRules.MIN_LENGTH + " characters"),
    NO_DIGIT("Password must contain at least one DIGIT"),
    NO_UPPERCASE("Password must contain at least one UPPERCASE LETTER"),
    NO_LOWERCASE("Password must contain at least one LOWERCASE LETTER"),
    NO_SPECIAL_CHARACTER("Password must contain at least one SPECIAL CHARACTER: " + PasswordRules.SPECIAL_CHARACTERS);

    private final String message;

    PasswordError(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
