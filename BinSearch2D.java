import java.util.Arrays;

public class BinSearch2D {
    static int[] binarySearch(int[][] arr,int target){
        int rows=0,cols=arr[0].length-1;
        while((rows<arr.length)&&(cols>=0)){
            if(arr[rows][cols]==target){
                return new int[]{rows,cols};
            }
            else if(arr[rows][cols]<target){
                rows++;
            }
            else{
                cols--;
            }
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
      int[][] arr={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(binarySearch(arr,10)));
    }
}
