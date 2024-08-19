public class leed1 {

        public static void main(String args[]){
            char[] letters={'c','f','j'};
            char target='g';
            System.out.println("Greater target: "+ greaterTarget(letters,target));
        }
        static char greaterTarget(char[] letters, char target){
            int start=0,end=(letters.length-1);
            int mid;

            while(start<=end){
                mid=start+(end-start)/2;
                if(target<letters[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            return (letters[start%letters.length]);
        }

}
