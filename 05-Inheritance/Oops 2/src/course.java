import java.lang.*;
import java.util.*;
class course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName;
    public course(String courseName,int duration,double fee,String institutionName)
    {
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
        course.instituteName = instituteName;
    }
    public void displayCourseDetails()
    {
        System.out.println("Course name is "+ courseName);
        System.out.println("Course duration is "+ duration);
        System.out.println("Total fees is "+ fee);
        System.out.println("Institute: " + instituteName);
    }
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
    public static void main(String[] args) {
        course course1 = new course("Java Programming", 6, 500, "Tech Academy");
        course course2 = new course("Web Development", 4, 400, "Tech Academy");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course.updateInstituteName("Code Institute");
        System.out.println("After updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
