import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Ques1        String name = input.nextLine();
//        long rollno = input.nextLong();
//        Student student = new Student(name, rollno);
//        System.out.println(student);

        //Question2
        double length = input.nextDouble();
        double breadth = input.nextDouble();
        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.calculateArea();
    }
}
