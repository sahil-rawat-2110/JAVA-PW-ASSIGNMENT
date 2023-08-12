
//Q3 - Write a Java method to display the middle character of a string.
//  Note: a) If the length of the string is even there will be two middle characters.
//        b) If the length of the string is odd there will be one middle character.
//        input:
//        350
//
//        Output:
//        5


import java.util.Scanner;

public class ques_3 {

    static String middle(String s){
        if (s.length() % 2 == 0){
            return s.substring(s.length()/2 - 1, s.length()/2 + 1);
        }
        else {
            return s.substring(s.length()/2, s.length()/2 + 1 );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        System.out.println("Middle character of a string : " + middle(s));


    }
}
