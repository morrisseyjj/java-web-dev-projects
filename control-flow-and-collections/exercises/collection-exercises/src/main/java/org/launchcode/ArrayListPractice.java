package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListPractice {


//
//    // 4 arraylist
//    ArrayList<Integer> tenNumbersArrayList = new java.util.ArrayList<>();
//        tenNumbersArrayList.add(1);
//        tenNumbersArrayList.add(2);
//        tenNumbersArrayList.add(3);
//        tenNumbersArrayList.add(4);
//        tenNumbersArrayList.add(5);
//        tenNumbersArrayList.add(6);
//        tenNumbersArrayList.add(7);
//        tenNumbersArrayList.add(8);
//        tenNumbersArrayList.add(9);
//        tenNumbersArrayList.add(11);
//
//
    int[] tenNumArray = {1,2,3,4,5,6,7,8,9,11};

    public static int sumEven(ArrayList<Integer> tenNumArray) {

        int total = 0;
        for (int integer :tenNumArray)
            if (integer % 2 == 0) {
                total += integer;
            }
        return total;
    }
}
