import main.ex03.UserProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserProcessorTest {
    private UserProcessor processor;
    @BeforeEach
    void newUser() {
        processor = new UserProcessor();
    }

    @Test
    void shouldReturnSameEmailWhenValidEmail() {
        String email = "user@gmail.com";

        String result = processor.checkEmail(email);

        assertEquals(email, result);
    }

    @Test
    void shouldThrowExceptionWhenEmailMissingAtSymbol() {
        String email = "usergmail.com";

        assertThrows(IllegalArgumentException.class, () -> processor.checkEmail(email));
    }

    @Test
    void shouldThrowExceptionWhenEmailMissingDomain() {

        // Arrange
        String email = "user@";

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> {
            processor.checkEmail(email);
        });
    }

    @Test
    void shouldConvertEmailToLowerCase() {

        // Arrange
        String email = "Example@Gmail.com";

        // Act
        String result = processor.checkEmail(email);

        // Assert
        assertEquals("example@gmail.com", result);
    }
}