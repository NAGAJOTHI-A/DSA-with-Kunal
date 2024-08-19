public class SearchMountain {
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int peak=findPeak(arr);
        if(arr[peak]==target){
            return peak;
        }
        int firstTry=binSearch(arr,target,0,peak-1);
       if(firstTry==-1)
         return binSearch(arr,target,peak+1,arr.length-1);
       return firstTry;
    }
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
    static int binSearch(int[] arr,int target,int start,int end){

        int mid;
        boolean isAscen=arr[start]<arr[end];
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(isAscen){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if(target>arr[mid]){
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
