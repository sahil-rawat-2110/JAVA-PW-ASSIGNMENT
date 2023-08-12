//Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to
//        find the Kth smallest element in the given array. It is given that all array elements are
//        distinct.
//
//        Input:
//        N = 6
//        arr[] = 7 10 4 3 20 15
//        K = 3
//
//        Output:
//        7


import java.util.Arrays;
import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n +" element of Array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("sorted array: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println( "Kth smallest number in the given array is : " + arr[k-1]);
    }
}
