
import java.util.Scanner;

public class Q_26ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that you want to reverse it: ");
        int num = input.nextInt();

        System.out.println("Reversing using while loop: " + reverse(num));
        reverseUsingStringBuffer(num);
        reverseUsingStringBuilder(num);
    }

    public static int reverse(int num){
        int reverse = 0;
        while (num != 0){
            reverse = reverse * 10 +  num % 10;
            num = num/10;
        }
        return reverse;
    }

    public static void reverseUsingStringBuffer(int num){
        String numToString = String.valueOf(num);         //it will change int number into string
        StringBuffer sb = new StringBuffer(numToString);
        StringBuffer reverse = sb.reverse();
        System.out.println("Reversing using StringBuffer: " + reverse);
    }

    public static void reverseUsingStringBuilder(int num){
        StringBuilder sbl =new StringBuilder();
        sbl.append(num);
        StringBuilder reverse = sbl.reverse();
        System.out.println("Reversing Using StringBuilder: " + reverse);

    }
}
