package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the Radius of the Circle?  ");
        // Part A & B
        // double radius = input.nextDouble();

        // Part A (Area Class)
//    double area = (radius * radius) * Math.PI;
//    System.out.println("The Area of the Circle is: " + area);
//        }

        // Part B (Circle Class)
//    System.out.println("The Area of the Circle is: " + Circle.getArea(radius));
//    }

        // BONUS 1
        if (input.hasNextDouble()) {
            double radius = input.nextDouble();

            if (radius > 0) {
                System.out.println("The Area of the Circle is: " + Circle.getArea(radius));
            } else {
                System.out.println("Enter a Positive number. ");
            }
        } else {
            System.out.println("Enter a Number");
        }
    }
}

// Bonus 2