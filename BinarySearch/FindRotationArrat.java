package DSA_Pratice.BinarySearch;
public class FindRotationArrat {
    public static void main(String[] args) {
        int[] arr = {  7,8,9, 3 , 4, 5, 6};
        System.out.println("The Number Of Rotations : "+findR(arr));
    }
    static int findR(int[] arr){
        int start = 0 , end = arr.length - 1;
        while(start <= end ){
            int mid = start + (end - start) / 2;
            if( end > mid  && arr[mid] > arr[mid + 1]){
                return ((arr.length ) - (mid + 1)  ) % arr.length;
            } if( mid > start && arr[mid -1] > arr[mid]){
                return ((arr.length ) - (mid - 1)  ) % arr.length;
            }else if( arr[mid] > arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return 0; 
    }
}
