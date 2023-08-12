public class ques_5 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        System.out.println("Before swap the values of x is " + x + " and y is " + y);
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swap the value of x is " + x + " and y is " + y);
    }
}
