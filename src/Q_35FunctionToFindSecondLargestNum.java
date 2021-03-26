import java.util.Arrays;

public class Q_35FunctionToFindSecondLargestNum {

    public static void main(String[] args) {


        int [] arr = new int []{3,5,7,4,8,6};
        int [] arr2 = {1,2,3,4,5,6};

        int count = arr.length;
        int count2 = arr2.length;

        System.out.println("Second largest num is: "+getSecondLargestNumber(arr,count));
        System.out.println("Second largest num is: "+getSecondLargestNumber(arr2,count2));

    }


    public static int getSecondLargestNumber(int[] arr, int count){
        Arrays.sort(arr);
        return arr[count-2];
    }

}
