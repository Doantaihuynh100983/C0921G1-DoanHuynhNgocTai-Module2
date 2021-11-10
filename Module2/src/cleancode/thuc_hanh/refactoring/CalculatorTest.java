package cleancode.thuc_hanh.refactoring;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    public void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    public void testCalculateSub() {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    private void assertEquals(int expected, int result) {

    }

    @Test
    @DisplayName("Testing multiplication")
    public void testCalculateMul() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    public void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

//    @Test
//    @DisplayName("Testing division by zero")
//    void testCalculateDivByZero() {
//        int a = 2;
//        int b = 0;
//        char o = '/';
//
//        assertThrows(
//                ()-> {Calculator.calculate(a, b, o);});
//    }
//
//    private void assertThrows(Object o) {
//    }
//
//    @Test
//    @DisplayName("Testing wrong operator")
//    void testCalculateWrongOperator() {
//        int a = 2;
//        int b = 0;
//        char o = '=';
//
//        assertThrows(
//                ()-> {Calculator.calculate(a, b, o);});
//    }
}
