import java.util.Scanner;

public class Q_23SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nth Number that you want for sum of all natural number:");
        int nth = input.nextInt();
        int i = 1;
        int sum =0;


        while (i <= nth){
            sum +=i;
            i++;
        }
        System.out.println("Sum of "+ (i -1)+ " natural numbers is: "+ sum);
    }
}
