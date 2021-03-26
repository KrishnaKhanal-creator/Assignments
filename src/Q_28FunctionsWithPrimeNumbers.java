public class Q_28FunctionsWithPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("a.");

        System.out.println(isPrimeNumber(5));

        System.out.println();
        System.out.println("b.");

        firstNthPrime(10);

        System.out.println();
        System.out.println();
        System.out.println("c.");

       allPrimeBetween(7,29);


    }

    public static boolean isPrimeNumber(int num) {

        boolean isPrime = true;
        if(num == 0 || num == 1){
            return false;
        }
        for (int i = 2; i <= num/2 ; i++) {
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
        }
        return isPrime;
    }

    public static void firstNthPrime(int nth) {
        int count = 0;
        for (int n = 2; true; n++) {
                boolean prime = true;
                for (int i = 2; i <= n / 2; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(n+ " ");
                    count++;
                }

                if(count == nth){
                    break;
                }

        }

    }

    public static void allPrimeBetween(int start, int end) {
        for (int n = start; n<= end; n++) {
            boolean prime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(n + " ");
            }


        }
    }

}

