package com.code100;

public class ReverseOfANumberLogic {

    public static void main(String[] args) {


        System.out.println(ReverseOfANumber(101));


    }

    public static int ReverseOfANumber(int number){


        int reverse=0;
        while(number!=0){
           reverse  = reverse *10;
            reverse = reverse +number%10;
            number=number/10;
        }return reverse;
    }

}
