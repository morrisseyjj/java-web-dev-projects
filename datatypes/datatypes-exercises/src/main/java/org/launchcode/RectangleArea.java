package org.launchcode;

import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Rectangle Length:");
        Integer length = input.nextInt();

        System.out.println("Enter Rectangle Width:");
        Integer width = input.nextInt();

        Integer area = width * length;
        System.out.println("The Rectangle Area is :  " + area);
    }
}
