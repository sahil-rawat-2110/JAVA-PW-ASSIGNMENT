import java.util.Scanner;
public class ques_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark_1 = sc.nextInt();
        int mark_2 = sc.nextInt();
        int mark_3 = sc.nextInt();
        int total_marks = mark_1 + mark_2 + mark_3;
        int percentage = total_marks/3;
        System.out.println("Total marks : " + total_marks);
        System.out.println("Percentage : " + percentage + "%");
    }
}
