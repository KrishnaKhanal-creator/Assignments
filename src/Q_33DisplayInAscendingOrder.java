import java.util.Scanner;

public class Q_33DisplayInAscendingOrder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a size of array that you want to enter: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter numbers that you want to make elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

        int temp;


      for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+ arr[i] + " ");
        }




    }
}
