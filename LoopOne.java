
/**
 * Write a description of class LoopOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopOne
{
    // instance variables - replace the example below with your own
    int[] array = new int[10];

    /**
     * Constructor for objects of class LoopOne
     */
    public LoopOne()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void loadArray()
    {
        int var = 0;
        for(int i = 0; i < 10; i++){
            var = (i+1)*5;
            array[i] = var;}
    }
    public void printArray(){
        for(int i = 0; i < 10; i++){
            System.out.println("" + array[i]);}
    }
}
