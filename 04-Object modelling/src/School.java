import java.lang.*;

class Course {
    private String courseName;
    private Student[] students;
    private int studentCount;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new Student[10];
        this.studentCount = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Cannot enroll more students in " + courseName);
        }
    }

    public void listStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("  - " + students[i].getName());
        }
    }
}

class Student {
    private String name;
    private Course[] courses;
    private int courseCount;

    public Student(String name) {
        this.name = name;
        this.courses = new Course[10];
        this.courseCount = 0;
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
            course.enrollStudent(this);
        } else {
            System.out.println(name + " cannot enroll in more courses.");
        }
    }

    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("  - " + courses[i].getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private Student[] students;
    private int studentCount;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new Student[20];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount++] = student;
        } else {
            System.out.println("Cannot add more students to " + schoolName);
        }
    }

    public void listStudents() {
        System.out.println("Students of " + schoolName + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("  - " + students[i].getName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("SRM");

        Student s1 = new Student("AAA");
        Student s2 = new Student("BBB");

        school.addStudent(s1);
        school.addStudent(s2);

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(math);

        s1.viewCourses();
        s2.viewCourses();

        math.listStudents();
        science.listStudents();

        school.listStudents();
    }
}
