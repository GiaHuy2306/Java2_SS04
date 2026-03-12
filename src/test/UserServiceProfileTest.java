import main.ex06.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceProfileTest {

    @Test
    void updateProfile_success() {

        Userz user = new Userz("a@gmail.com",
                LocalDate.of(2000,1,1));

        UserProfile profile = new UserProfile(
                "b@gmail.com",
                LocalDate.of(1999,5,5));

        List<Userz> users = new ArrayList<>();

        Userz result = UserServiceProfile.updateProfile(user, profile, users);

        assertNotNull(result);
    }

    @Test
    void updateProfile_futureBirthDate() {

        Userz user = new Userz("a@gmail.com",
                LocalDate.of(2000,1,1));

        UserProfile profile = new UserProfile(
                "b@gmail.com",
                LocalDate.now().plusDays(1));

        List<Userz> users = new ArrayList<>();

        Userz result = UserServiceProfile.updateProfile(user, profile, users);

        assertNull(result);
    }

    @Test
    void updateProfile_duplicateEmail() {

        Userz user = new Userz("a@gmail.com",
                LocalDate.of(2000,1,1));

        UserProfile profile = new UserProfile(
                "b@gmail.com",
                LocalDate.of(1999,1,1));

        List<Userz> users = new ArrayList<>();
        users.add(new Userz("b@gmail.com",
                LocalDate.of(1990,1,1)));

        Userz result = UserServiceProfile.updateProfile(user, profile, users);

        assertNull(result);
    }

    @Test
    void updateProfile_sameEmail() {

        Userz user = new Userz("a@gmail.com",
                LocalDate.of(2000,1,1));

        UserProfile profile = new UserProfile(
                "a@gmail.com",
                LocalDate.of(1999,2,2));

        List<Userz> users = new ArrayList<>();

        Userz result = UserServiceProfile.updateProfile(user, profile, users);

        assertNotNull(result);
    }

    @Test
    void updateProfile_emptyUserList() {

        Userz user = new Userz("a@gmail.com",
                LocalDate.of(2000,1,1));

        UserProfile profile = new UserProfile(
                "new@gmail.com",
                LocalDate.of(1999,1,1));

        List<Userz> users = new ArrayList<>();

        Userz result = UserServiceProfile.updateProfile(user, profile, users);

        assertNotNull(result);
    }

    @Test
    void updateProfile_duplicateEmailAndFutureBirthDate() {

        Userz user = new Userz("a@gmail.com",
                LocalDate.of(2000,1,1));

        UserProfile profile = new UserProfile(
                "b@gmail.com",
                LocalDate.now().plusDays(5));

        List<Userz> users = new ArrayList<>();
        users.add(new Userz("b@gmail.com",
                LocalDate.of(1990,1,1)));

        Userz result = UserServiceProfile.updateProfile(user, profile, users);

        assertNull(result);
    }
}