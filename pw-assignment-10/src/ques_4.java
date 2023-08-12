//Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a
//        continuous sub-array which adds to a given number S.
//        In case of multiple subarrays, return the subarray which comes first on moving from left
//        to right.
//        You need to print the start and end index of answer subarray.
//
//        Input:
//        N = 5, S = 12
//        A[] = {1,2,3,7,5}
//
//        Output:
//        1 3


import java.util.Scanner;

public class ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of S : ");
        int s = sc.nextInt();
        System.out.println("Enter the element of array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < n){
            sum += arr[j];
            if (sum > s){
                while (sum > s && i < j){
                    sum -= arr[i];
                    i++;

                }
            }
            if (sum == s){
                System.out.print(i + " " );
                System.out.print(j);
                break;
            }
            j++;
        }


    }
}




























