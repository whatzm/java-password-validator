package test;

import base.BaseTest;
import data.PasswordValidatorDataProvider;
import data.SmokePasswordValidatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositivePasswordTest extends BaseTest {

    @Test(dataProvider = "positivePasswordData",
            dataProviderClass = PasswordValidatorDataProvider.class,
            groups = {"positiveValidation", "regression"})
    public void verifyValidPassword(String password) {
        Assert.assertTrue(
                passwordValidator.getErrors(password).isEmpty(),
                "Password is invalid: " + password
        );
    }

    @Test(dataProvider = "smokePositivePasswordData",
            dataProviderClass = SmokePasswordValidatorDataProvider.class,
            groups = "smoke")
    public void verifySmokeValidPassword(String password) {
        Assert.assertTrue(
                passwordValidator.getErrors(password).isEmpty(),
                "Password is invalid: " + password
        );
    }
}
