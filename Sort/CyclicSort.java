package Sort;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] array = { 5 , 3 , 4 , 2 , 0 , 1};
        System.out.println("The Sorted Arrays is : " + Arrays.toString(cycleSort( array )));
    }

    private static int[]  cycleSort(int[] array) {
        int i = 0 ;
        while( i < array.length){
            int correct = array[i];
            if(correct != i){
               int temp = array[correct];
               array[correct] = array[i];
               array[i] = temp;
            }else{
                i++;
            }
        }
        return array;
    }
}
