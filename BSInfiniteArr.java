public class BSInfiniteArr {
    static int findRange(int[] arr,int target){
       int start=0;
       int end=1;
       int newstart;
       while(arr[end]<target){
           newstart=end+1;
           end=end+((end-start+1)*2);
           start=newstart;
       }
       return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]<target){
                //right
                start=mid+1;
            }
            else if(arr[mid]>target){
                //left
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        //your arr should have the limit contains target if its not
        //you will get index out of bound err
        int target=14;
        System.out.println(findRange(arr,target));
    }

}
