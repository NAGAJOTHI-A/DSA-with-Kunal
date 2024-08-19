import java.util.ArrayList;
import java.util.List;

public class MissingArray {
    public static void main(String[] args){
        int[] arr={4,3,2,4,8,2,3,2};
        System.out.println(findMiss(arr));
    }
    static List<Integer> findMiss(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> answer=new ArrayList<>();
        //case 1
        for(int ind=0;ind<arr.length;ind++){
            if(arr[ind]!=ind+1){
                answer.add(ind+1);
            }
        }
        return answer;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
