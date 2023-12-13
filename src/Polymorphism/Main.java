
package Polymorphism;

public class Main {


   
    public static void main(String[] args) {
       polymorphism_book my_book = new polymorphism_book ();
        polymorphism_drinks my_drinks = new polymorphism_drinks ();
        polymorphism_food my_food = new polymorphism_food ();
        
       
        
        System.out.println("---------------------------");
        my_book.MyHabbit();
        my_drinks.MyHabbit();
        my_food.MyHabbit();
    }
    
}