
package Lamp;

public class lampara {
    


    boolean is_on;

    void turnOn() {
        System.out.println("light's on!");
    }

    void turnOff() {
        System.out.println("light's off!");

    }
}
class main{
    
public static void main (String [] args){
    lampara led = new lampara();
    lampara Halogen = new lampara();
    led.turnOff();
    Halogen.turnOn();
    
}


}