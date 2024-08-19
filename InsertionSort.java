import java.util.Arrays;

public class InsertionSort {
    static void insertion(int[] arr){
        int i,j;
        for(i=0;i<arr.length-1;i++){
           for(j=i+1;j>0;j--){
               if(arr[j]<arr[j-1]){
                   swap(arr,j,j-1);
               }
               else{
                  break;
               }
           }
        }
    }
    static void swap(int[] arr,int secInd,int firInd){
        int temp=arr[firInd];
        arr[firInd]=arr[secInd];
        arr[secInd]=temp;
    }
    public static void main(String[] args) {
        int[] arr= {-6,-10,5,3,2,4,1,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
