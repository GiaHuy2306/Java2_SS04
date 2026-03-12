package main.ex02;

public class UserService {
    public static boolean checkRegistration(int age){
        if (age < 0) {
            throw new IllegalArgumentException("Tuoi khong duoc am");
        }
        return age >= 18;
    }
}
