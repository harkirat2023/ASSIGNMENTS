
import java.util.Arrays;
import java.util.Scanner;

/*Write a function which accepts a 2D array of integers and its size as arguments and
displays the elements of middle row and the elements of middle column. Printing can
be done in any order.
[Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]*/
public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of 2D Array: ");
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
        // System.out.println("Mid row: ");
        // System.out.println("Mid column: ");
        int mid = ((n - 1) / 2);
        System.out.println("Middle row: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid && j < n)
                    System.out.print(a[i][j] + " ");
            }
        }
        System.out.println();
        System.out.println("Middle column: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid && j < n)
                    System.out.print(a[j][i] + " ");
            }
        }

        scan.close();
    }
}
