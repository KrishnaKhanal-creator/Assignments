import java.util.Scanner;

public class Q_22TableOfGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = input.nextInt();

        int count = 1;
        while (count<=10){
            int result = num * count;
            System.out.println(num +" * " + count + " = " + result);
            count++;

        }
    }
}
