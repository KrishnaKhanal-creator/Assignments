public class Q_36DuplicateInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,4,5,5,6,6};

        System.out.println("Duplicate elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i] == arr[j])
                    System.out.print(arr[i] + " ");


            }

        }

    }

}
