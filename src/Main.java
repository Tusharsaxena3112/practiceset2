import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        long rollno = input.nextLong();
        Student student = new Student(name, rollno);
        System.out.println(student);
    }
}
