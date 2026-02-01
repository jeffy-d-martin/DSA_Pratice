package Sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int [] arr = { 2 , 8 , 3, 1 , 0 };
        System.out.println("The Answer is : " + Arrays.toString( sSort(arr)));
    }
    static int[] sSort(int[] arr){
        for( int i = 0 ; i < arr.length ; i++){
            int minimum = 10000;
            int pos = 0;
            for( int j = i ; j < arr.length ; j++){
                if( arr[j] < minimum ){
                    pos = j;
                    minimum = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        return arr;
    }
}
