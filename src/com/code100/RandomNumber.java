package com.code100;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        RandomNumber randomNumber = new RandomNumber();

        Random random = new Random();

        for(int i = 0; i<=20; ++i) {
            System.out.println(random.nextInt(20 ));
        }
        System.out.println(random.nextFloat());
    }
}
