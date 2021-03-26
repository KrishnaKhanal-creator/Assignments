import java.util.Scanner;

public class Q_34ReverseTheArrayElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

        System.out.println("Original array looks like: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reverse of original array is: ");

        for (int i = arr.length-1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
