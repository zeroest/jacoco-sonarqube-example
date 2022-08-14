package me.zeroest.sonar.example.app.core;

public class ExtendedOperator {

    public static int apply(Operation op, int x, int y) {
        switch (op) {
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                return 0;
        }
    }

}
