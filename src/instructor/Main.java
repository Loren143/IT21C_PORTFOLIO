
package instructor;

public class Main {
   

    public static void main(String[] args) {
      
    
    
        Student student = new Student("Loren Dacol", 2004, "Bachelor of Science in Information Technology");

        System.out.println("Student's Information: " + student);
        System.out.println("Student's Major: " + student.getMajor());

        Instructor instructor = new Instructor("Jonah Pacana", 1996, 27000);

        System.out.println("Instructor's Information: " + instructor);
        System.out.println("Instructor's Salary: " + instructor.getSalary());
    }
}