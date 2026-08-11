package helper;

import password_validator.PasswordError;

import java.util.HashSet;
import java.util.List;

public class PasswordValidatorTestHelper {

    public static boolean errorsAreEqual(List<PasswordError> actual, List<PasswordError> expected) {
        return new HashSet<>(actual).equals(new HashSet<>(expected));
    }
}
