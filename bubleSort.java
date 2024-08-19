import java.util.Arrays;

public class bubleSort {
    static void sortBubble(int[] arr){
        int i,j;
        boolean swap;
        int n=arr.length;
        for(i=0;i<n;i++){
            swap=false;
          for(j=1;j<n-i;j++){
              if(arr[j]<arr[j-1]){
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                  swap=true;
              }
          }
          if(!swap){
                break;
          }
        }

    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
