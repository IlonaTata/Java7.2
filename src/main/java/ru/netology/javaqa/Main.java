package ru.netology.javaqa;

public class Main {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        long actual = service.calculate(100000060, true);
        System.out.println(actual);


    }
}