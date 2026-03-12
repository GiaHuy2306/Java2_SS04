package main.ex01;

public class UserValidator {
    public static boolean isValidUserName(String userName) {
        if (userName.length() >= 6 && userName.length() <= 20 && !userName.contains(" ")) {
            System.out.println("Hop le");
            return true;
        }else if (userName.contains(" ")) {
            System.out.println("Chua khoang trang");
            return false;
        }
        System.out.println("Qua ngan");
        return false;
    }
}
