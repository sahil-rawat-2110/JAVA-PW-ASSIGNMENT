//Q2 - Write a Java method to count all vowels in a string
//        Input:(consists of all lowercase letters)
//        coding
//
//        Output:
//        2


import java.util.Scanner;

public class ques_2 {

    static int count(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("No. of vowels in String are : " + count(s));

    }
}
