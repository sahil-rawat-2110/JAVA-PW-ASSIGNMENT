//Q2 - Given an array of size n, find the total number of occurrences of given number x.
//        Input:
//        n = 7
//        arr[] = [3, 5, 0, 7, 8, 3, 0]
//        x = 0
//
//        Expected output:
//        2
//


import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements of array : " );
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x :  ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == x){
                count++;
            }
        }
        System.out.println("Total number of occurrences of " + x + " is : " + count);

    }

}














