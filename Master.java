import java.util.Arrays;

public class Master{
    public static void main(String[] args){

        int[] meinArray;
        meinArray = new int[4];
        meinArray[0] = 7;
        meinArray[1] = 12;


       System.out.println("Feld 1: " + meinArray[0]);
       System.out.println("Feld 2: " + meinArray[1]);
       System.out.println("Ganzes Array: " + Arrays.toString(meinArray));
       

    }
}