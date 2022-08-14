package me.zeroest.sonar.example.app.core;

public class BasicOperator {

    public static int apply(Operation op, int x, int y) {
        switch (op) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            default:
                return 0;
        }
    }

}
