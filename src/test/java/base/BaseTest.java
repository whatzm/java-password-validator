package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import password_validator.PasswordValidator;

public abstract class BaseTest {

    protected PasswordValidator passwordValidator;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        passwordValidator = null;
    }
}