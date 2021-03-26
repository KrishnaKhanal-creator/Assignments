public class MoreNumberPatterns {
    public static void main(String[] args) {
        System.out.println("------------1");
        for(int i =1; i<= 5 ; i++){
            for(int j = 1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------2");
        for(int i =1; i<= 5 ; i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------3");

        for(int i =5; i>= 1 ; i--){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------4");
        for(int i =1; i<= 5 ; i++){
            for(int j = 5;j>=i;j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("------------5");
        for(int i =5; i>= 1 ; i--){
            for(int j = 5;j>=i;j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("------------6");
        for(int i =1; i<= 5 ; i++){
            for(int j = 5;j>=i;j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("------------7");
        for(int i =1; i<= 5 ; i++){
            for(int j = 5;j>=i;j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("------------8");
        for(int i =1; i<= 5 ; i++){
            for(int j = 5;j>=i;j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        for(int i =1; i<= 5 ; i++){
            for(int j = 5;j>=i;j--){
                System.out.print("  ");
            }
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
