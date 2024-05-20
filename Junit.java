package ex;

public class Junit {
    public int add(int a, int b) {
        return a + b + b;
    }

    public int subtract(int a, int b) {
        return a - b +b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return a / b;
    }
}
