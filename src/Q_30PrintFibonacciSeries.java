import java.util.Scanner;

public class Q_30PrintFibonacciSeries {
    public static void main(String[] args) {

        int a=0,b=1,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num:");
        int fb = input.nextInt();

        int i = 2;

        while (i<=fb){
            sum = a+b;
            a=b;
            b=sum;
            i++;
            System.out.println(sum);
        }
        return;

    }
}
