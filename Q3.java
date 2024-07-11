
import java.util.Arrays;
import java.util.Scanner;
// // Deleted
// // class MaxElement extends InputArray {
// //     public static void max(int[] a) {
// //         int max = a[0];
// //         int n = a.length;
// //         for (int i = 0; i < n; i++) {
// //             if (a[i] > max) {
// //                 max = a[i];
// //             }
// //         }
// //         System.out.println("Max element is " + max);
// //     }
// // }

class InputArray {
    public static void Takeit(Scanner sc) {
        System.out.print("Enter Size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element [" + i + "]" + " ");
            a[i] = sc.nextInt();
        }
        System.out.println("Original Array entered by user: ");
        System.out.println(Arrays.toString(a));

        // Code to print maximum element in an array
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max element is " + max);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputArray in = new InputArray();
        in.Takeit(sc);
    }
}
