package Prelab;

import java.math.BigInteger;

public class MyIntegerTest {
    public static void main(String[] args) {
        // Testing the MyInteger class

        MyInteger myInt1 = new MyInteger(29);
        MyInteger myInt2 = new MyInteger(30);

        // Test getters
        System.out.println("Value of myInt1: " + myInt1.getValue()); // 29

        // Test instance methods
        System.out.println("myInt1 is even: " + myInt1.isEven()); // false
        System.out.println("myInt1 is odd: " + myInt1.isOdd()); // true
        System.out.println("myInt1 is prime: " + myInt1.isPrime()); // true

        System.out.println("myInt2 is even: " + myInt2.isEven()); // true
        System.out.println("myInt2 is odd: " + myInt2.isOdd()); // false
        System.out.println("myInt2 is prime: " + myInt2.isPrime()); // false

        // Test static methods
        System.out.println("Is 31 even? " + MyInteger.isEven(31)); // false
        System.out.println("Is 31 odd? " + MyInteger.isOdd(31)); // true
        System.out.println("Is 31 prime? " + MyInteger.isPrime(31)); // true

        System.out.println("Is myInt1 even? " + MyInteger.isEven(myInt1)); // false
        System.out.println("Is myInt1 odd? " + MyInteger.isOdd(myInt1)); // true
        System.out.println("Is myInt1 prime? " + MyInteger.isPrime(myInt1)); // true

        // Test equals methods
        System.out.println("myInt1 equals 29: " + myInt1.equals(29)); // true
        System.out.println("myInt1 equals myInt2: " + myInt1.equals(myInt2)); // false

        // Test parseInt methods
        char[] chars = {'1', '2', '3'};
        System.out.println("Parsed int from char[]: " + MyInteger.parseInt(chars)); // 123

        String str = "456";
        System.out.println("Parsed int from String: " + MyInteger.parseInt(str)); // 456

        // Test factorial method
        int number = 20; // Change this to test other values
        BigInteger factorial = MyInteger.factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial); // 2432902008176640000
    }
}

