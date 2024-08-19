public class OrderAgnostic {
        public static void main(String args[]){
            int[] arr={10,9,8,7,6,5,4,3};
            int target=3;
            System.out.println("Index of the Target: "+binSearch(arr,target));
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
        static int binSearch(int[] arr,int target){
            int start=0,end=(arr.length-1);
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
