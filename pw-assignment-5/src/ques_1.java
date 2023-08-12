//Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
//        Input:
//        6
//        Expected Output:
//        1 1 2 3 5 8



//     Using Recursion

import java.util.Scanner;

public class ques_1 {
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Fibonacci series of " + n + " numbers : ");
        for (int i = 1; i <=n; i++){
            System.out.print(fibonacci(i) + " ");
        }


    }
}


//       using for loop

//import java.util.Scanner;
//public class ques_1 {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int a = 1; //initial 2 elements are 1 and 1
//        int b = 1;
//        for(int i = 1; i <= n; i++){
//            System.out.print(a + " ");
//            int sum = a+b; //calculating every 3rd element in the series by summing up previous 2
//            a = b; //update previous element to next element
//            b = sum;//update b to newly created next element
//        }
//    }
//}
//
