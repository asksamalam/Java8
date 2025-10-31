package org.example.stream;

import java.util.function.*;

public class lambdaExpression {
    public static void main(String[] args) {
        Consumer<Integer> c = (x) -> System.out.println("this is number "+ x);
        c.accept(5);
    }
}
