package test;

import base.BaseTest;
import data.PasswordValidatorDataProvider;
import helper.PasswordValidatorTestHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import password_validator.PasswordError;

import java.util.List;

public class PasswordErrorTest extends BaseTest {

    @Test(dataProvider = "passwordErrorsData",
            dataProviderClass = PasswordValidatorDataProvider.class,
            groups = "errorValidation")
    public void verifyGetErrors(String password, List<PasswordError> expectedErrors) {
        List<PasswordError> actualErrors = passwordValidator.getErrors(password);
        Assert.assertTrue(PasswordValidatorTestHelper.errorsAreEqual(actualErrors, expectedErrors));
    }
}
