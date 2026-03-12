package main.ex04;

public class ValidatePassword {
    public static String evaluatePasswordStrength(String password) {
        boolean length = password.length() >= 8;
        boolean upper = password.matches(".*[A-Z].*");
        boolean lower = password.matches(".*[a-z].*");
        boolean digit = password.matches(".*\\d.*");
        boolean special = password.matches(".*[^a-zA-Z0-9].*");

        if (!length) {
            return "Yếu";
        }

        int count = 0;
        if (upper) count++;
        if (lower) count++;
        if (digit) count++;
        if (special) count++;

        if(count == 4) {
            return "Mạnh";
        }
        else if(count == 3) {
            return "Trung bình";
        }else {
            return "Yếu";
        }
    }
}
