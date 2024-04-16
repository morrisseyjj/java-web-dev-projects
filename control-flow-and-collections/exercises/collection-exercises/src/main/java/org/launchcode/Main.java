package org.launchcode;

import java.util.Arrays;
import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] sixNumArray = {1, 1, 2, 3, 5, 8};
        System.out.println(Arrays.toString(sixNumArray));
// for each loop
        for (int num : sixNumArray) {
            System.out.println(num);
        }
// line break / space
        System.out.println("\n");
// for-each Loop
        for (int num : sixNumArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
//3
        String sentenceString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = sentenceString.split("\\.");
        System.out.println(Arrays.toString(words));

//4
        // 4 arraylist
        ArrayList<Integer> tenNumbersArrayList = new java.util.ArrayList<>();
        tenNumbersArrayList.add(1);
        tenNumbersArrayList.add(2);
        tenNumbersArrayList.add(3);
        tenNumbersArrayList.add(4);
        tenNumbersArrayList.add(5);
        tenNumbersArrayList.add(6);
        tenNumbersArrayList.add(7);
        tenNumbersArrayList.add(8);
        tenNumbersArrayList.add(9);
        tenNumbersArrayList.add(11);
        System.out.println(tenNumbersArrayList);

        public static int sumEven(ArrayList<Integer> tenNumbersArrayList) {
            int total = 0;
            for (int integer : tenNumbersArrayList) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;

        }
//        System.out.println(sumEven);


    }
}