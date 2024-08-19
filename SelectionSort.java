import java.util.Arrays;

public class SelectionSort {
    public static void selectSort(int[] arr){
        int i,j;
        int n=arr.length;
        int lastIndex,maxIndex;
        for(i=0;i<n;i++){
                lastIndex=n-i-1;
                maxIndex=findMax(arr,0,lastIndex);
                swap(arr,maxIndex,lastIndex);
        }
    }
    static void swap(int[] arr,int max,int last){
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }
    static int findMax(int[] arr,int start,int end){
        int max=start;
        int i;
        for(i=start+1;i<=end;i++){
            if(arr[i]>arr[max]){
               max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,4,3,7};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
