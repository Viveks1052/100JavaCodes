package com.code100;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("factorial is :- "+factorial(5));

    }

    public static int factorial(int number){
        int factorial=1;
        while(number>0){
//            factorial = number*(number-1);
//            number--;
            factorial = factorial*number;
            number--;
        }return factorial;
    }
}
