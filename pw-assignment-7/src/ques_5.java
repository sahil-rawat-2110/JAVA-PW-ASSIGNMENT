//Q5. Write a program that would print the information (name, year of joining, salary, address) of three
//    employees by creating a class named 'Employee'. The output should be as follows
//        Name	  Year of joining	   Address   	  Salary
//        Robert	1994	       64C-WallsStreet	  45000
//        Sam	    2000	       68D-WallsStreet	  55000
//        john	    1999	       26B-WallsStreet 	  60000




class Employee{
    String name;
    int year_of_joining;
    int salary;
    String address;

}

public class ques_5 {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.name = "Robert";
        a.year_of_joining = 1994;
        a.address = "64C-WallsStreet";
        a.salary = 45000;
        Employee b = new Employee();
        b.name = "Sam";
        b.year_of_joining = 2000;
        b.address = "68D-WallsStreet";
        b.salary = 55000;
        Employee c = new Employee();
        c.name = "john";
        c.year_of_joining = 1999;
        c.address = "26B-WallsStreet";
        c.salary = 60000;
        System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Address" + "\t" + "Salary");
        System.out.println(a.name + "\t" + a.year_of_joining + "\t" + a.address + "\t" + a.salary);
        System.out.println(b.name + "\t" + b.year_of_joining + "\t" + b.address + "\t" + b.salary);
        System.out.println(c.name + "\t" + c.year_of_joining + "\t" + c.address + "\t" + c.salary);



    }
}



