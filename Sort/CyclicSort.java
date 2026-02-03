package Sort;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] array = { 5 , 3 , 4 , 2 , 0 , 1};
        System.out.println("The Sorted Arrays is : " + Arrays.toString(cycleSort( array )));
    }

    private static int[]  cycleSort(int[] array) {
        for( int i = 0 ; i < array.length ; i++){
            if(array[i] != i){
                int pos = array[i];
                array[i] = i;
                i = pos;
            }
        }
        return array;
    }
}
