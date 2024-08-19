public class leet2 {
    public static void main(String args[]){
       int[][] arr={{1,5},{7,3},{3,5}};
       System.out.println("Maximum Wealth:"+maxWealth(arr));
    }
    /* account- array
    person- row
    accounts- coloumn */
    static int maxWealth(int[][] accounts){
        int ans =Integer.MIN_VALUE;
        int sum;
        for(int[] person:accounts){
            sum=0;
            for(int account:person){
                sum+=account;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
