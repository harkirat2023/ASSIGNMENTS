
import java.util.Arrays;
import java.util.Scanner;

// Q4: Write a program to find the largest element of a given 2D array of integers.

public class Q4 {
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
        System.out.println("largest element in array: ");
        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
        scan.close();

    }
}
