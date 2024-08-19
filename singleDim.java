import java.util.*;
import java.util.Arrays;

public class singleDim {
 public static void main(String args[]) {
     //int i;
     int j;
     int[] arr = new int[10];
     //Scanner sc = new Scanner(System.in);
     //  System.out.println("Enter a Array of 10 Elements:");
//     for(i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//     }
//     System.out.println("Array: "+Arrays.toString(arr));
     arr[0] = 1;
     arr[1] = 2;
     arr[2] = 3;
     arr[3] = 4;
     arr[4] = 5;
//     for (int element : arr) {
//         System.out.println("Array element:" +element);
//     }
      for(j=0;j<10;j++){
          System.out.println("Array element "+(j+1)+" :"+arr[j]);
      }
 }
}
