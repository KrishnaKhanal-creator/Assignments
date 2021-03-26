import java.util.Scanner;

public class Q_25StudentWithHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of  Students: ");
        int numberOfStudent = input.nextInt();

        int count = 1;
        double highest = 0;
        String  studentWithHighestScore ="";

        while (count <= numberOfStudent) {
            System.out.println("Enter Student Score: ");
            double score = input.nextDouble();
            System.out.println("Enter Student Name: ");
            String name = input.next();                     //can read first name only..
            if (score > highest) {
                highest = score;
                studentWithHighestScore = name;
            }
            count++;
        }

        System.out.println("The highest score : " + highest);
        System.out.println("Name of Student with high score is: "+ studentWithHighestScore);
    }
}

