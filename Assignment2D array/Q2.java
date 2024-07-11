// Q2: write a program to print the elements above the secondary diagonal in a user inputted
// square matrix.

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows in 2D Array: ");
        int m = scan.nextInt();
        System.out.print("Enter the number of columns in 2D Array: ");
        int n = scan.nextInt();
        System.out.println();

        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter Element: [" + i + "][" + j + "]:  ");
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("Array entered by user: ");
        for (int[] arr : a) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Elements above Secondary diagonal: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n - 1) {
                    System.out.print(a[i][j] + "  ");
                    System.out.print("At index [" + i + "][" + j + "]");
                    
                }
            }
        }
        System.out.println();
        scan.close();
    }

}
