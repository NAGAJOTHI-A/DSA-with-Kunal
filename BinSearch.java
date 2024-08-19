
public class BinSearch {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=10;
        System.out.println("Index of the Target: "+binSearch(arr,target));
    }
    static int binSearch(int[] arr,int target){
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
        return -1;
    }

}

