import java.util.Scanner;
public class Q_29MathematicalFunction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nth number: ");
        int nth = input.nextInt();
        double sum = 0;
        int i = 1;
        while (i<= nth) {
                sum = sum + (double)i/findFact(i);
                i++;
        }
        System.out.println("Sum of series of number is: "+ sum);

    }public static int findFact(int n){
        int i= 1;
        int fact = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }
        return fact;

    }

}

