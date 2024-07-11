
import java.util.Arrays;
import java.util.Scanner;

//Peak element :- who is greater than its sudden left and right element
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

        // Code to print peak element in an array
        int peak_element = 0;
        for (int i = 1; i < n - 1; i++) {
            // Both conditions to be true so && is used
            // Only one thik hai pher bhi chale ge then we use || operator
            if (a[i] > a[i + 1] && a[i] > a[i - 1]) {
                peak_element = a[i];
            }
        }
        System.out.println("THE PEAK ELEMENT OF ARRAY: " + peak_element);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputArray in = new InputArray();
        in.Takeit(sc);
    }
}
