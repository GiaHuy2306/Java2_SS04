package main;

public class Practice {
    // Phuong thuc kiem tra so nguyen to
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Phuong thuc tinh so fibonaci thu n
    public static int totalFibonacci (int n) {
        if(n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // Xay dung cac test case cho tat ca cac truong hop co the xay ra cua 2 phuong thuc
}
