public class leedhard {
    public static void main(String args[]){
     int[] arr={7,2,5,10,8};
     int m=2;
     System.out.println("Maximum Sum:"+splitArr(arr,m));
    }
    static int splitArr(int[] arr,int m){
        int start=0;
        int end=0,i;
        for(i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        int mid;
        int pieces,sum;
        while(start<end){
            mid=(start+(end-start)/2);
            pieces=1;
            sum=0;
            for(int element:arr){
                if((sum+element)>mid){
                    pieces++;
                    sum=element;
                }
                else{
                    sum+=element;
                }
            }
            if(pieces<=m){
                //less piece->more(sum less)
                end=mid;
            } else if (pieces>m) {
                //more piece->less(sum increase)
                start=mid+1;
            }
        }
        return start;
    }
}
