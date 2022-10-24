package ru.netology.javaqa;

public class CalculatorService {

    public long calculate(int amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
