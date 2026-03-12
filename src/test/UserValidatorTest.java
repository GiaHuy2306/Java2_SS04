import main.ex01.UserValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    UserValidator userValidator = new UserValidator();
    @Test
    void TC01_isValidUserName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.isValidUserName("user123");
        assertTrue(result);
    }

    @Test
    void TC02_isValidUserToSort() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.isValidUserName("abc");
        assertFalse(result);
    }

    @Test
    void TC03_isValidUserHasSpace() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.isValidUserName("user name");
        assertFalse(result);

    }
}