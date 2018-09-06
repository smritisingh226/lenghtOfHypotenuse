package com.smriti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float side1, side2, hypotenuse, area;
        System.out.print("Enter the length of first side: ");
        Scanner sc = new Scanner(System.in);
        side1 = sc.nextInt();
        System.out.print("Enter the length of secind side: ");
        Scanner s = new Scanner(System.in);
        side2 = s.nextInt();
        hypotenuse = (side1*side1 + side2*side2);
        System.out.print("The hypotenuse of the right angled triangle is: "+hypotenuse);
        area = side1* side2;
        System.out.println("\nThe area if the right angled triangle is:"+area);
    }
}
