import java.util.Scanner;

public class Q_27SumAndProductOfGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number for sum and product: ");
        int num = input.nextInt();

        sumOfNumber(num);
        productOfNumber(num);

    }

    public static void sumOfNumber(int num){
        int lastDigit = 0;
        int sum = 0;
        while (num != 0) {
            lastDigit =  num%10;
            num = num / 10;
            sum = sum +  lastDigit;
        }
        System.out.println("Sum of all digit of given number is: " +sum);
        }

    public static void productOfNumber(int num){
        int lastDigit = 0;
        int product = 1;
        while (num != 0) {
            lastDigit =  num%10;
            num = num / 10;
            product = product *  lastDigit;
        }
        System.out.println("Product of all digit of given number is: " +product);
    }

}
