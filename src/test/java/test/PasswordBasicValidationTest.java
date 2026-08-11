package test;

import base.BaseTest;
import data.PasswordTestData;
import data.PasswordValidatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordBasicValidationTest extends BaseTest {

    @Test(dataProvider = "passwordData",
            dataProviderClass = PasswordValidatorDataProvider.class,
            groups = "basicValidation")
    public void verifyHasMinimalLength(PasswordTestData password) {
        Assert.assertEquals(
                passwordValidator.hasMinLength(password.getPassword()),
                password.isExpectedMinLength()
        );
    }
}
