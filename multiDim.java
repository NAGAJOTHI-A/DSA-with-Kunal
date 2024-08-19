import java.util.*;
public class multiDim {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int[][] arr=new int[3][2];
    for(int i=0;i< arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.println("Enter Array"+"["+(i)+"]"+"["+(j)+"] :");
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("Array Elements:");
    for(int i=0;i< arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

}
}
