//Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
//        negative or zero. Calculate the sum of numbers until a negative number is encountered. I
//        f the input is a negative number, current sum is discarded and print -1.
//        Input:
//        2
//        48
//        0
//        6
//        -5
//        9
//        7
//        Expected Output1:
//        -1




import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            if(num >= 0){
                sum += num;
            }
            else{
                sum = -1;
                break;
            }
        }
        System.out.print(sum);
    }
}
