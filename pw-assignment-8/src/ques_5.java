//Q5 - Write a Java method to find the smallest number among three numbers.
//        Input:
//        25
//        37
//        29
//
//        Output:
//        25


import java.util.Scanner;

public class ques_5 {

    static int smallest(int a, int b, int c){
        if (a < b && a < c){
            return a;
        }
        else if (b < a && b < c){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Smallest number : " + smallest(a, b, c));


    }
}
