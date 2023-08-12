//Q3. Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
//    of its length and breadth as parameters of its constructor and having a method named 'returnArea'
//    which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.


import java.util.Scanner;
class Area{
    public int returnArea(int l, int b){
        return l*b;
    }
}
public class ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = sc.nextInt();
        System.out.println("Enter breadth: ");
        int b = sc.nextInt();
        Area a = new Area();
        System.out.println(a.returnArea(l, b));
    }
}
