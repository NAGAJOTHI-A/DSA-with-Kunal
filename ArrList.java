import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static  void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>(2);
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        list.add(60);
//        System.out.println("Array List:");
//        System.out.println(list);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array List Elements upto 5:");
         for(int j=0;j<5;j++){
             list.add(sc.nextInt());
         }
        System.out.println("Array List :");
        for(int j=0;j<5;j++){
            System.out.println(list.get(j));
        }
    }
}
