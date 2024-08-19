import java.util.*;
public class mudability {
    static void change(int[] arr1){
        arr1[2]=1;
        arr1[3]=2;
    }
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        for(i=0;i<arr.length;i++){
            System.out.println("Enter array Element "+(i+1)+" :");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Before Mudability: "+Arrays.toString(arr));
        change(arr);
        System.out.println("Array After Mudability: "+Arrays.toString(arr));
    }
}
