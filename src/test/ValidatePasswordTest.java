import main.ex04.ValidatePassword;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatePasswordTest {

    @Test
    void testPasswordStrength() {

        assertAll("Password Test",

                () -> {
                    System.out.println("TC01: Abc123!@ -> Mạnh");
                    assertEquals("Mạnh",
                            ValidatePassword.evaluatePasswordStrength("Abc123!@"));
                },

                () -> {
                    System.out.println("TC02: abc123!@ -> Trung bình");
                    assertEquals("Trung bình",
                            ValidatePassword.evaluatePasswordStrength("abc123!@"));
                },

                () -> {
                    System.out.println("TC03: ABC123!@ -> Trung bình");
                    assertEquals("Trung bình",
                            ValidatePassword.evaluatePasswordStrength("ABC123!@"));
                },

                () -> {
                    System.out.println("TC04: Abcdef!@ -> Trung bình");
                    assertEquals("Trung bình",
                            ValidatePassword.evaluatePasswordStrength("Abcdef!@"));
                },

                () -> {
                    System.out.println("TC05: Abc12345 -> Trung bình");
                    assertEquals("Trung bình",
                            ValidatePassword.evaluatePasswordStrength("Abc12345"));
                },

                () -> {
                    System.out.println("TC06: Ab1! -> Yếu");
                    assertEquals("Yếu",
                            ValidatePassword.evaluatePasswordStrength("Ab1!"));
                },

                () -> {
                    System.out.println("TC07: password -> Yếu");
                    assertEquals("Yếu",
                            ValidatePassword.evaluatePasswordStrength("password"));
                },

                () -> {
                    System.out.println("TC08: ABC12345 -> Yếu");
                    assertEquals("Yếu",
                            ValidatePassword.evaluatePasswordStrength("ABC12345"));
                }
        );
    }
}