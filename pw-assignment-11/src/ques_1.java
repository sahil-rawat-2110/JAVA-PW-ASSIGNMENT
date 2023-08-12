//Q1 - Given an array sorted in increasing order of size n and an integer x, find if there exists a
//        pair in the array whose absolute difference is exactly x.(n>1)
//
//        Input:
//        N = 5
//        Arr[] = [5,10,15,20,26]
//        x= 10
//
//        Expected Output:
//        yes


import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " element of the array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x : ");
        int x = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                if (arr[j] - arr[i] == x){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");

    }
}
