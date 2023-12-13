
package inheritance;


public class Dog extends Animal{
    
 Dog(String Dog){
      super(Dog);
    }
    
    void tulog(){
        System.out.println( Animal +" kay na tulog");
    }
    
    void meowmeow(){
        System.out.println( Animal +" kay ga kalamorag meowmeow");
    }
    
    void kaon(){
        System.out.println( Animal +" kay nag kaon ");
    }
}