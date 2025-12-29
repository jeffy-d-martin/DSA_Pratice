package DSA_Pratice.BinarySearch;
public class BinarySe {
    public static void main(String[] args) {
        char [] arr = {'a', 'c' , 'f' , 'm'};
        char target = 'z';
        System.out.println("The Answer : "+floor(arr , target));
    }
    static char floor( char[] arr , char target){
        int first = 0 , last = arr.length - 1;
        while (first < last) {
            int mid = first + (last - first) / 2;
            if( arr[mid] == target){
                return arr[mid];
            }
            else if( arr[mid] > target ){
                last = mid - 1;
            }
            else if( arr[mid] < target ){
                first = mid + 1;
            }
        }

        return arr[first];
    }
}