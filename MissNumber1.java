public class MissNumber1 {
    public static void main(String[] args){
       int[] arr={1,0,3,2};
       System.out.println(findMiss(arr));
    }
    static int findMiss(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        //case 1
        for(int ind=0;ind<arr.length;ind++){
            if(arr[ind]!=ind){
                return ind;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
