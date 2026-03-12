package main.ex03;

public class UserProcessor {
    public static String checkEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email phai co '@'");
        }
        String[] check =  email.split("@");
        if (check.length != 2 || check[1].isEmpty()) {
            throw new IllegalArgumentException("Sau '@' phai co ten mien");
        }
        return email.toLowerCase();
    }
}
