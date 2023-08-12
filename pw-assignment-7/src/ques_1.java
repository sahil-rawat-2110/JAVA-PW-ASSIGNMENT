//Q1. Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
//    the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.



class Student{
    String name;
    int roll_no;
}
public class ques_1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sahil Kumar Rawat";
        s.roll_no = 49;
        System.out.println("Name of the student s is " + s.name + " and roll no. is " + s.roll_no) ;

    }
}
