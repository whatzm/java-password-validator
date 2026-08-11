package data;

import org.testng.annotations.DataProvider;
import password_validator.PasswordError;

import java.util.List;

public class PasswordValidatorDataProvider {

    @DataProvider(name = "passwordData")
    public PasswordTestData[] passwordData() {
        return new PasswordTestData[]{
                new PasswordTestData(
                        "Qwerty1!",
                        true,
                        true,
                        true,
                        true,
                        true
                ),
                new PasswordTestData(
                        "Qwertyuiop!",
                        true,
                        false,
                        true,
                        true,
                        true
                ),
                new PasswordTestData(
                        "QWERTYUIO1!",
                        true,
                        true,
                        true,
                        false,
                        true
                ),
                new PasswordTestData(
                        "Qwertyui1",
                        true,
                        true,
                        true,
                        true,
                        false
                ),
                new PasswordTestData(
                        "12345678",
                        true,
                        true,
                        false,
                        false,
                        false
                ),
                new PasswordTestData(
                        "Asdfghjk",
                        true,
                        false,
                        true,
                        true,
                        false
                ),
                new PasswordTestData(
                        "!@#$%^&*",
                        true,
                        false,
                        false,
                        false,
                        true
                ),
                new PasswordTestData(
                        "Qwe1!",
                        false,
                        true,
                        true,
                        true,
                        true
                )
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
