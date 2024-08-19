public class floorArr {
    public static void main(String args[]){
        int[] arr={11,13,24,35,38,40};
        int target=10;
        System.out.println("Index of the Target: "+ floor(arr,target));
    }
    static int floor(int[] arr, int target){
        int start=0,end=(arr.length-1);
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }

}
