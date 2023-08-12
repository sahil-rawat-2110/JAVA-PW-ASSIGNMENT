//Q5 - Write a Java program to test the equality of two arrays.
//
//        Input:
//        5
//        2 5 7 9 11
//        2 5 7 9 13
//
//        Output:
//        false


import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " element of the array 1 : ");
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        boolean ans = true;
        int[] arr2 = new int[n];
        System.out.println("Enter " + n + " element of the array 2 : ");
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
            if(arr2[i] != arr1[i]){
                ans = false;
                break;
            }
        }
        System.out.print(ans);
    }
}
