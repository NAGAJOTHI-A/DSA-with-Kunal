public class findTargetRotated {

    private static int pivot;

    static int peak(int arr[]){
        int start=0,end=arr.length-1;
        int mid;
        while(start<end){
            mid=(start+(end-start)/2);
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>arr[mid]){
                //we are in descending
                end=mid-1;
            } else if (arr[start]<arr[mid]) {
                //we are in ascending
                start=mid+1;
            }
        }
        return -1;
    }
    static int findRotate(int arr[],int target){
        pivot = peak(arr);
        if(pivot ==-1){
            return binSearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(arr[0]<=target){
            return binSearch(arr,target,0, pivot -1);
        }
        return binSearch(arr,target, pivot +1, arr.length-1);
    }
    static int binSearch(int[] arr,int target,int start,int end){
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

    public static void main(String args[]){
      int[] arr={10,11,15,19,25,28,1,2,4,5,9};
      int target=9;
      System.out.println("target index:"+findRotate(arr,target));
    }
}
