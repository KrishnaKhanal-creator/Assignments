import java.util.Scanner;

public class Q_32DisplaySumOf5ValuesInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 5 elements: ");

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array is: " + sum);
    }
}

