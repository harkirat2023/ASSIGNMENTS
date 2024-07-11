import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element[" + i + "]" + " ");
            arr[i] = sc.nextInt();
        }
        for (int var : arr) {
            if (var % 2 == 0) {
                System.out.print(" " + var + " ");
            }
        }
    }
}