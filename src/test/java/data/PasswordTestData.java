package data;

public class PasswordTestData {
    private final String password;
    private final boolean expectedMinLength;
    private final boolean expectedDigit;
    private final boolean expectedUpperCase;
    private final boolean expectedLowerCase;
    private final boolean expectedSpecialCharacter;

    public PasswordTestData(String password,
                            boolean expectedMinLength,
                            boolean expectedDigit,
                            boolean expectedUpperCase,
                            boolean expectedLowerCase,
                            boolean expectedSpecialCharacter) {
        this.password = password;
        this.expectedMinLength = expectedMinLength;
        this.expectedDigit = expectedDigit;
        this.expectedUpperCase = expectedUpperCase;
        this.expectedLowerCase = expectedLowerCase;
        this.expectedSpecialCharacter = expectedSpecialCharacter;
    }

    public String getPassword() {
        return password;
    }

    public boolean isExpectedMinLength() {
        return expectedMinLength;
    }

    public boolean isExpectedDigit() {
        return expectedDigit;
    }

    public boolean isExpectedUpperCase() {
        return expectedUpperCase;
    }

    public boolean isExpectedLowerCase() {
        return expectedLowerCase;
    }

    public boolean isExpectedSpecialCharacter() {
        return expectedSpecialCharacter;
    }
}
