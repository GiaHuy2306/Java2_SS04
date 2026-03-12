import main.Practice;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTest {
    Practice p = new Practice();

    @Test
    @DisplayName("Kiem tra co phai so nguyen to ko: \n")
    void isPrime() {
        assertTrue(p.isPrime(2));
        assertTrue(p.isPrime(3));
//        assertTrue(p.isPrime(4));
        assertTrue(p.isPrime(5));
//        assertTrue(p.isPrime(6));
    }

    @Test
    @DisplayName("Tinh fibonacci")
    void totalFibonacci() {
        assertEquals(0, p.totalFibonacci(0));
        assertEquals(1, p.totalFibonacci(2));
        assertEquals(2, p.totalFibonacci(3));
        assertEquals(3, p.totalFibonacci(4));
//        assertEquals(5, p.totalFibonacci(10));
    }
}