public class Student {
    private String name;
    private long rollno;

    public Student(String name, long rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String toString() {
        return "My name is " + name + "Roll no is" + rollno;
    }
}
