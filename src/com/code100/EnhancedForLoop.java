package com.code100;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class EnhancedForLoop {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,20};

        for(int value : arr){
            System.out.print(value+" ");
        }

        Set<Integer> set = new LinkedHashSet<>();{
            for(int value:arr){
                set.add(value);
            }
            System.out.println(set);
        }


    }
}
