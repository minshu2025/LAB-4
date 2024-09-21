package Prelab;

import java.math.BigInteger;

public class MyInteger {
    private int value;

    // Constructor
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    // Instance methods
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public boolean equals(int otherValue) {
        return this.value == otherValue;
    }

    public boolean equals(MyInteger other) {
        return this.value == other.value;
    }

    // Static methods
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return isEven(myInt.value);
    }

    public static boolean isOdd(MyInteger myInt) {
        return isOdd(myInt.value);
    }

    public static boolean isPrime(MyInteger myInt) {
        return isPrime(myInt.value);
    }

    public static int parseInt(char[] chars) {
        String str = new String(chars);
        return Integer.parseInt(str);
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    // New method to calculate factorial
    public static BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

