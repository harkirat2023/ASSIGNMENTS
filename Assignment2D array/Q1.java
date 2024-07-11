// Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0.

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in 2D array: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of rows in 2D array: ");
        int n = sc.nextInt();
        System.out.println();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter Element [" + i + "][" + j + "]");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("The array entered by user is:  ");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        int countp = 0;
        int countn = 0;
        int count0 = 0;
        int counto = 0;
        int counte = 0;
        for (int i = 0; i < m; i++) {
            {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] > 0) {
                        countp++;
                    }
                    if (arr[i][j] < 0) {
                        countn++;
                    }
                    if (arr[i][j] == 0) {
                        count0++;
                    }
                    if (arr[i][j] % 2 == 0) {
                        counte++;
                    }
                    if (arr[i][j] % 2 != 0) {
                        counto++;
                    }
                }
            }
        }
        System.out.println("number of positive numbers " + countp);
        System.out.println("number of negative numbers " + countn);
        System.out.println("number of 0 " + count0);
        System.out.println("number of even numbers " + counte);
        System.out.println("number of odd numbers " + counto);
    }
}

//Took 4:14 