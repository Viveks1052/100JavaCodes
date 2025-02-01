package com.code100;

public class BreakAndContinueStatements {

    public static void main(String[] args) {
        int n = 10;

        for(int i = 0; i<n ;++i){
            if(i==5){
            break;  // it will break the loop and return the results.
        }else{
                System.out.println("values are ="+i);
            }


        }

        for(int i = 0; i<n ;++i){
            if(i==5){
                continue;  // it will skip the 5 value and print the rest
            }else{
                System.out.println("values are ="+i);
            }
        }

    }


}
