package data;

import org.testng.annotations.DataProvider;
import password_validator.PasswordError;

import java.util.List;

public class SmokePasswordValidatorDataProvider {

    @DataProvider(name = "smokePositivePasswordData")
    public String[] smokePositivePasswordData() {
        return new String[]{
                "Qwerty1!",
                "QWERTYUIOPa123456789!",
                "Qw1@#$%^&*(",
        };
    }

    @DataProvider(name = "smokeNegativePasswordData")
    public String[] smokeNegativePasswordData() {
        return new String[]{
                "Qwertyui123",
                "Qwe1!",
        };
    }

    @DataProvider(name = "smokePasswordErrorsData")
    public Object[][] smokePasswordErrorsData() {
        return new Object[][]{
                {
                        "abc",
                        List.of(
                                PasswordError.TOO_SHORT,
                                PasswordError.NO_DIGIT,
                                PasswordError.NO_UPPERCASE,
                                PasswordError.NO_SPECIAL_CHARACTER
                        )
                },
                {
                        "Qwertyui!",
                        List.of(
                                PasswordError.NO_DIGIT
                        )
                }
        };
    }
}
