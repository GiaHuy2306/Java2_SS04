package main.ex06;

import java.time.LocalDate;
import java.util.List;

public class UserServiceProfile {

    public static Userz updateProfile(Userz existingUser,
                                     UserProfile newProfile,
                                     List<Userz> allUsers) {

        if (newProfile.getBirthDate().isAfter(LocalDate.now())) {
            return null;
        }

        String newEmail = newProfile.getEmail();

        if (!newEmail.equals(existingUser.getEmail())) {

            for (Userz u : allUsers) {
                if (u.getEmail().equals(newEmail)) {
                    return null;
                }
            }
        }

        existingUser.setEmail(newEmail);
        existingUser.setBirthDate(newProfile.getBirthDate());

        return existingUser;
    }
}