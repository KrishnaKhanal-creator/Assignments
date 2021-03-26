public class Q_37PerformAddition {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

        // printing the array1
        System.out.println("First Array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Array: ");
        int [][] arr2 = {{4,5,6},{2,7,8},{3,1,9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }


        // calculation
        int [][] arrSum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrSum[i][j] = arr1[i][j] + arr2[i][j] ;
            }
        }

        System.out.println("Sum is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrSum[i][j] + " ");
            }
            System.out.println();
        }



    }

}
