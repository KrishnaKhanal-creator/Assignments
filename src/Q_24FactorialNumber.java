import java.util.Scanner;

public class Q_24FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number that you want factorial for: ");
        int num = input.nextInt();


        factorial(num);
    }

public static void factorial(int num) {
    int i = 1;
    int result = 1;

    if (num == 0){
        System.out.println("invalid");
    }
    else {
        while (i <= num) {
            result = result * i;
            i++;
        }
        System.out.println("factorial of " + num + " = "  + result);
    }

}
}
