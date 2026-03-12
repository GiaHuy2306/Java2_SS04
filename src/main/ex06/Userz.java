package main.ex06;

import java.time.LocalDate;

public class Userz {
    private String email;
    private LocalDate birthDate;

    public Userz(String email, LocalDate birthDate) {
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
