import java.util.Arrays;
import java.util.Scanner;

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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputArray in = new InputArray();
        in.Takeit(sc);
    }
}