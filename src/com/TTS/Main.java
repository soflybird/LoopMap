package com.TTS;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static Scanner input;

    public static void main(String[] args) {

        Scanner readme = new Scanner(System.in);
        System.out.println("Enter Five Numbers (Press Enter after each):");

        int n1, n2, n3, n4, n5, n6;
        n1 = readme.nextInt();
        n2 = readme.nextInt();
        n3 = readme.nextInt();
        n4 = readme.nextInt();
        n5 = readme.nextInt();
        n6 = n1 + n2 + n3 + n4 + n5;

        int[] arr = {n1, n2, n3, n4, n5};
        int smallest = Integer.MAX_VALUE;
        int indexSmall = 0;
        while (indexSmall < arr.length) {
            if (smallest > arr[indexSmall]) {
                smallest = arr[indexSmall];
            }
            indexSmall++;

            int largest = Integer.MIN_VALUE;
            int indexLarge = 0;
            while (indexLarge < arr.length) {
                if (largest < arr[indexLarge]) {
                    largest = arr[indexLarge];
                }
                indexLarge++;


            }
            System.out.println("These numbers total: = " + n6);
            System.out.println("The smallest number is: " + smallest);
            System.out.println("The largest number is: " + largest);
        }
    }
}

