
package Polymorphism;

public class Main {


   
    public static void main(String[] args) {
       Polymorphism_Book my_book = new Polymorphism_Book ();
        Polymorphism_Drinks my_drinks = new Polymorphism_Drinks ();
        Polymorphism_Food my_food = new Polymorphism_Food ();
        
       
        
        System.out.println("---------------------------");
        my_book.MyHabbit();
        my_drinks.MyHabbit();
        my_food.MyHabbit();
    }
    
}