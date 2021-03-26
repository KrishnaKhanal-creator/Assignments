import java.util.Scanner;

public class Q_21DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number i.e correspond to day of the week: ");
        boolean hasNextInt = input.hasNextInt();
        if (hasNextInt){
            int num = input.nextInt();
            if(num == 1){
                System.out.println("Sunday");
            } else if (num == 2){
                System.out.println("Monday");
            }else if (num == 3){
                System.out.println("Tuesday");
            }else if (num == 4){
                System.out.println("Wednesday");
            }else if (num == 5){
                System.out.println("Thursday");
            }else if (num == 6){
                System.out.println("Friday");
            }else if (num == 7){
                System.out.println("Saturaday");
            }
            else System.out.println("You Entered a number that does not correspond to day of the week"+
                        ". Your number need to be between 1-7.");
        }
        input.close();
    }
}
