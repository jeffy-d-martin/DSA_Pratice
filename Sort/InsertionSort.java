package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5 , 4  , 2 , 3 , 1};
        System.out.println("The Sorted Array is : " + Arrays.toString(insertionSort(arr)));
    }
    static int[] insertionSort( int[] arr ){
        for( int i = 0 ; i < arr.length - 1 ; i++ ){
            for( int j = i + 1 ; j > 0 ; j-- ){
                if( arr[j] < arr[j - 1]){
                    sort( arr , j ,  j - 1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    static void sort( int[] arr , int a , int b ){
        int temp = arr[ a ] ;
        arr[ a ] = arr [ b ] ;
        arr[ b ]  = temp;
    }
}
