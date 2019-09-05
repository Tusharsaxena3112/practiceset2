package question4;

public class Student {
    private String name;
    private double marks;

    public Student() {
        this.name = "unknown";
        this.marks = 0.0;
    }

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Name => " + name + "\nMarks => " + marks;
    }
}
