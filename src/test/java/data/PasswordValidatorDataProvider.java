package data;

import org.testng.annotations.DataProvider;
import password_validator.PasswordError;

import java.util.List;

public class PasswordValidatorDataProvider {

    @DataProvider(name = "positivePasswordData")
    public String[] positivePasswordData() {
        return new String[]{
                "Qwerty1!",
                "Qwerty123!",
                "Password1!",
                "Qwerty123!",
                "Test1234@",
                "QWERTYUIOPa123456789!",
                "Qw1@#$%^&*(",
                "QWERTy1!"
        };
    }

    @DataProvider(name = "negativePasswordData")
    public String[] negativePasswordData(){
        return new String[]{
                "Q",
                "Qwerty",
                "password",
                "PASSWORD",
                "12345678",
                "!@#$%^&*",
                "Qwertyui123",
                "Qwerty!@#",
                "Qwe1!",
                "qwerty123!"
        };
    }

    @DataProvider(name = "passwordErrorsData")
    public Object[][] passwordErrorsData() {
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
                },
                {
                        "qwertyui1!",
                        List.of(
                                PasswordError.NO_UPPERCASE
                        )
                },
                {
                        "QWERTYUI1!",
                        List.of(
                                PasswordError.NO_LOWERCASE
                        )
                },
                {
                        "Qwertyui1",
                        List.of(
                                PasswordError.NO_SPECIAL_CHARACTER
                        )
                },
                {
                        "Qw1!",
                        List.of(
                                PasswordError.TOO_SHORT
                        )
                },
                {
                        "Qwerty1!",
                        List.of()
                },
                {
                        "QWE123",
                        List.of(
                                PasswordError.TOO_SHORT,
                                PasswordError.NO_LOWERCASE,
                                PasswordError.NO_SPECIAL_CHARACTER
                        )
                }
        };
    }

}
