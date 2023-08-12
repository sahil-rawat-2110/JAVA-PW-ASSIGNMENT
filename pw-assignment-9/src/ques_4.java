//Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using the standard library method for calculating the minimum element.
//
//        Output:
//        -4


import java.util.Arrays;

public class ques_4 {
    public static void main(String[] args) {
        int arr[] = {2, -3, 5, 8, 1, 0, -4};
        Arrays.sort(arr);
        System.out.println("Minimum element : " + arr[0]);

    }
}
