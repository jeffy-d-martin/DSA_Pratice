package BinarySearch;

public class InfinitySizeArray {
    public static void main(String [] args){
        int[] arr = {1 , 2 , 3 , 5 , 6 , 7 , 8 , 10 , 11 , 12 , 15 , 20 , 23 , 30};
        int target = 15;
        System.out.print("The Postion of the Array : " + ans(arr , target));
    }
    static int  ans( int[] arr , int target ){
        int start = 0 ;
        int end = 1;
        while( target > arr[end]){
            int newStart = end + 1;
            end += ( end  - start + 1) * 2;
            start = newStart;
        }
        System.out.println(start + " " + end);
        return binarySearch(arr , target , start , end);
    }

    static int binarySearch(int[] arr , int target , int start , int end ){
        while( start <= end ){
            int mid = start + ( end - start) / 2;
            if( arr[mid] == target ){
                return mid;
            }
            else if ( arr[mid] > target ) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    
}
