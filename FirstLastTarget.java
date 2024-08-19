import java.util.Arrays;

//leed2
public class FirstLastTarget {
    public static void main(String args[]){
        int[] arr={5,7,8,9,18};
        int target=7;
        System.out.println("Index of the Target: "+ Arrays.toString(result(arr,target)));
    }
    static int[] result(int[] arr,int target){
        int[] ans={-1,-1};
        ans[0]=binSearch(arr,target,true);
        if(ans[0]!=-1)
         ans[1]=binSearch(arr,target,false);
        return ans;
    }
    static int binSearch(int[] arr,int target,boolean firstOcc){
        int start=0,end=(arr.length-1);
        int mid;
        int ans =-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(firstOcc){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
