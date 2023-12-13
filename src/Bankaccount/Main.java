
package Bankaccount;

public class Main {
    


     public static void main(String[]args){
         bankaccount account= new bankaccount ("Loren", 19,104556,100);
         
         account.deposit(13.0);
         account.deposit(4.0);
           
           System.out.println(account.getSummary());
     }
}