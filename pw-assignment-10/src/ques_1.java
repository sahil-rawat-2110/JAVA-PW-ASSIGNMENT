//Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place
//        all negative elements at the end of array without changing the order of positive elements
//        and negative elements
//
//        Input :
//        N = 8
//        arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
//
//        Output :
//        1 3 2 11 6 -1 -7 -5
//


import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n  +" element of the array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                ans[idx] = arr[i];
                idx++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 ){
                ans[idx] = arr[i];
                idx++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(ans[i] + " ");
        }

    }
}
