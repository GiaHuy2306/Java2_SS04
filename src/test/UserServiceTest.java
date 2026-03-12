import main.ex02.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    @Test
    void TC_userAge18() {
        UserService service = new UserService();
        boolean result = service.checkRegistration(18);
        System.out.println("TC01: Age: 18 -> Expected: true -> Result: " + result);
        assertEquals(true, result);
    }

    @Test
    void TC_userAge17() {
        UserService service = new UserService();
        boolean result = service.checkRegistration(17);
        System.out.println("TC02: Age: 17 -> Expected: false -> Result: " + result);
        assertEquals(false, result);
    }

    @Test
    void TC_userNegative() {
        UserService service = new UserService();
        System.out.println("TC03: Age: -1 -> Expected: false -> Result: " + service.checkRegistration(-1));
        assertThrows(IllegalArgumentException.class, () -> service.checkRegistration(-1));
    }
}