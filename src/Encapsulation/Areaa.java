
package Encapsulation;


public class Areaa {
    

    int length;
        int width;
        
        Areaa (int length,int width){
            this.length = length;
            this.width = width;
                    
    }
    
        public void getArea(){
            int area = length+width;
            System.out.println("Area:"+area);
        }
}