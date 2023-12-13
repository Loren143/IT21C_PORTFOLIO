
package basic_oop;


public class Main {
    

    
     public static void main(String [] args){
    
   student student = new student();
    student.setName("Loren M. Dacol");
     student.setSection("it21C");
     student.setMotto("I found solace in sunset<33");
    
    
    
        System.out.println("Name: "+ student.name);
        System.out.println("Section: "+ student.section);
        System.out.println("Motto: "+ student.motto);
    
    }    
    
    
}