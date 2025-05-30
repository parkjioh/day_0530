package com.back;

public class Calc {
    public static int run(String exp) {
        String[] expbit = exp.split(" \\+ ");
        int num1 = Integer.parseInt(expbit[0]);
        int num2 = Integer.parseInt(expbit[1]);

        return num1 + num2;


    }
}
