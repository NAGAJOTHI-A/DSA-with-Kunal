import java.util.Scanner;
import java.util.Arrays;
public class StrArr {
    public static void main(String[] Args){
        String[] arr=new String[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Elements upto 5: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        System.out.println("Array Elements: ");
//        for(String str:arr){
//            System.out.print(str+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }
}
