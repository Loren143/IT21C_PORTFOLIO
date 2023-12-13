
package Sort;
import java.util.Arrays;

public class Array {


    private int[] numbers;
    
    public Array(int[]numbers){
        this.numbers=numbers;
    }
    
    public void OriginalArray(){
        System.out.println("Original Array:" +Arrays.toString(numbers));
    }
    
    public void sortArray(){
     Arrays.sort(numbers);   
        System.out.println("sorted array: " +Arrays.toString (numbers));
        
    }
    public static void main(String [] args){
        int [] array = {1,3,9,21,11,4};
        Array Sorter = new Array(array);
        Sorter.OriginalArray();
        Sorter.sortArray();
    }
}