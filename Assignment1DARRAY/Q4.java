
import java.util.Arrays;
import java.util.Scanner;
// // Good question 

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

        // Code to print Second maximum element in an array
        int smax = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            // if anything is greater than smax then its max
            if (smax < a[i]) {
                smax = max;
                max = a[i];
            } 
//if anything is greater than smax and less than max then its smax
            else if (a[i] < max && a[i] > smax) {
                smax = a[i];
            }
        }
        System.out.println("Second Max element is " + smax);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputArray in = new InputArray();
        in.Takeit(sc);
    }
}
