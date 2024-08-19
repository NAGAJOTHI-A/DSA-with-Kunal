public class FoundPeak {
    static int findPeak(int[] arr){
        int start=0,end=arr.length-1;
        int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                //Ascending
                start=mid+1;
            }
            else {
                //descending
                end=mid;
            }
        }
        return start;
    }
    public static void main(String[] Args){
        int[] arr= new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        System.out.println(findPeak(arr));
    }
}
