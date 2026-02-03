package Sort;
import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] array = { 5 , 3 , 4 , 2 , 1};
        System.out.println("The Sorted Arrays is : " + Arrays.toString(cycleSort( array )));
    }

    private static int[]  cycleSort(int[] array) {
        int index = 0;
        while ( index < array.length ){
            int correct = array[index] - 1;
            if( array[correct] != array[index] ){
                int temp = array[index];
                array[index] = array[correct];
                array[correct] = temp;
            }else{
                index++;
            }

        }
        return array;
    }
}
