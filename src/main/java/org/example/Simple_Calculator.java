package org.example;

public class Simple_Calculator {
    public static void main(String[] args) {
        char operator = '*';
        int num1 = 10, num2 = 5;
        int result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return; // Exit the method
        }

        System.out.println("Result: " + result); // Output: Result: 15
    }
}