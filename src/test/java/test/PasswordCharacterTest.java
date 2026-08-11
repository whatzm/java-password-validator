package test;

import base.BaseTest;
import data.PasswordTestData;
import data.PasswordValidatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordCharacterTest extends BaseTest {

    @Test(dataProvider = "passwordData",
            dataProviderClass = PasswordValidatorDataProvider.class,
            groups = "characterValidation")
    public void verifyHasDigitMethod(PasswordTestData password) {
        Assert.assertEquals(
                passwordValidator.hasDigit(password.getPassword()),
                password.isExpectedDigit()
        );
    }

    @Test(dataProvider = "passwordData",
            dataProviderClass = PasswordValidatorDataProvider.class,
            groups = "characterValidation")
    public void verifyHasUpperCase(PasswordTestData password) {
        Assert.assertEquals(
                passwordValidator.hasUpperCase(password.getPassword()),
                password.isExpectedUpperCase()
        );
    }

    @Test(dataProvider = "passwordData",
            dataProviderClass = PasswordValidatorDataProvider.class,
            groups = "characterValidation")
    public void verifyHasLowerCase(PasswordTestData password) {
        Assert.assertEquals(
                passwordValidator.hasLowerCase(password.getPassword()),
                password.isExpectedLowerCase()
        );
    }

    @Test(dataProvider = "passwordData",
            dataProviderClass = PasswordValidatorDataProvider.class,
            groups = "characterValidation")
    public void verifyHasSpecialCharacter(PasswordTestData password) {
        Assert.assertEquals(
                passwordValidator.hasSpecialCharacter(password.getPassword()),
                password.isExpectedSpecialCharacter()
        );
    }
}
