//Q4 - Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
//     Input:
//     2017
//
//     Output:
//     False


import java.util.Scanner;

public class ques_4 {

    static boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || ((year % 400) == 0)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }
}
