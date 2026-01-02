package BinarySearch;

public class Binary {
    public static void main(String[] args){
        int [] arr = { 1 , 3 , 55 , 77 , 78  , 80 };
        int target = 0;
        System.out.println("The Element :" + search( arr , target ));
    }
    static int search( int [] arr , int target ){
        int start = 0 , end = arr.length - 1;
        while( start <= end ){
            int mid = start + ( end - start) / 2 ;
            if( arr[mid] == target){
                return mid;
            }
            else if( arr[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
