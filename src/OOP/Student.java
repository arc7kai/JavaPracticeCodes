package OOP;

public class Student {

    // constant (no magic numbers)
    private static final int PASS_MARK = 40;

    // instance variables
    private long rollNo;
    private String name;
    private int marks;   // int is safer for marks

    // constructor
    public Student(long rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // getters and setters
    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // readable object representation
    @Override
    public String toString() {
        return String.format(
                "Student{rollNo=%d, name='%s', marks=%d}",
                rollNo, name, marks
        );
    }

    // business logic
    public boolean isPassed() {
        return this.marks >= PASS_MARK;
    }

    // helper method for readable result
    public String getResult() {
        return isPassed() ? "Passed" : "Failed";
    }

    // test
    public static void main(String[] args) {

        Student s1 = new Student(4040, "student1", 80);
        Student s2 = new Student(4043, "student2", 55);
        Student s3 = new Student(4041, "student3", 39);

        System.out.println(s1);
        System.out.println("Result: " + s1.getResult());

        System.out.println();

        System.out.println(s2);
        System.out.println("Result: " + s2.getResult());

        System.out.println();

        System.out.println(s3);
        System.out.println("Result: " + s3.getResult());
    }
}
