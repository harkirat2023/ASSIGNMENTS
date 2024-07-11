
import java.util.Arrays;
import java.util.Scanner;

// Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
// in any order.

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in 2D Array: ");
        int n = scan.nextInt();
        System.out.println();

        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
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
        System.out.println("Elements present on Secondary & Primary diagonal: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(a[i][j] + "  ");
                }
            }
        }
        scan.close();
    }
}
