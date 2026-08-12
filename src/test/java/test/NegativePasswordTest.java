package test;

import base.BaseTest;
import data.PasswordValidatorDataProvider;
import data.SmokePasswordValidatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativePasswordTest extends BaseTest {

    @Test(dataProvider = "negativePasswordData",
            dataProviderClass = PasswordValidatorDataProvider.class,
            groups = {"negativeValidation", "regression"})
    public void verifyInvalidPassword(String password) {
        Assert.assertFalse(
                passwordValidator.getErrors(password).isEmpty(),
                "Password in valid: " + password
        );
    }

    @Test(dataProvider =  "smokeNegativePasswordData",
    dataProviderClass = SmokePasswordValidatorDataProvider.class,
    groups = "smoke")
    public void verifySmokeInvalidPassword(String password) {
        Assert.assertFalse(
                passwordValidator.getErrors(password).isEmpty(),
                "Password is valid: " + password
        );
    }
}
