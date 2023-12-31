//Q2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//    creating a class named 'Triangle' without any parameter in its constructor


class Triangle{
    int a, b, c;
    public double area(){
        double s = (a+b+c)/2.0;
        return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
    }
    public double perimeter(){
        return (a+b+c)/2.0;
    }
}

public class ques_2 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.a = 3;
        t.b = 4;
        t.c = 5;
        System.out.println(t.area());
        System.out.println(t.perimeter());

    }
}
