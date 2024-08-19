import java.util.ArrayList;
import java.util.Scanner;

public class mulDimArrList {
    public static void main(String args[]){
        ArrayList<ArrayList<String>> list= new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ArrayElements:");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                list.get(i).add(sc.next());
            }
        }
        System.out.println(list);
    }
}
