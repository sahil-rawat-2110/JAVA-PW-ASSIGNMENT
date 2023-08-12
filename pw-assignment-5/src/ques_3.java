//Q3- Write a program to calculate the factorial of a number.
//        Input:
//        5
//        Expected Output:
//        120

//Using for loop

import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        System.out.println(result);

    }
}


//Using Resursion

//public class ques_3{
//    static int factorial(int n){
//        if (n == 0)
//            return 1;
//        else
//            return(n * factorial(n-1));
//    }
//    public static void main(String args[]){
//        int i, fact = 1;
//        int number = 6;
//        fact = factorial(number);
//        System.out.println("Factorial of "+number+" is: "+fact);
//    }
//}














