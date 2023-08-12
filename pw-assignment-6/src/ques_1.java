//Q1 - Convert a decimal number into binary
//        Input:
//        56
//
//        Output:
//        111000


import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int n = sc.nextInt();
        int binary_number = 0;
        int power = 1;
        while (n > 0){
            int rem = n % 2;
            binary_number += rem * power;
            power *= 10;
            n /= 2;

        }
        System.out.println(binary_number);
    }
}

















