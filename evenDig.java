import java.util.*;
public class evenDig {
public static void main(String args[]){
    int[] arr={10,33,-224,-32,0,2,5};
    System.out.println("No of Even digits in array: "+evenDigit(arr));
}
static int evenDigit(int[] arr){
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(even(arr[i])){
            count++;
        }
    }
    return count;
}
//it return if the element has even digits return true
static boolean even(int element){

    int digit=countdig(element);
    if(digit%2==0)
        return true;
    return false;
}
//it return count of digits
static int countdig(int element){
    int count=0;
    if(element==0){
        return 1;
    }
    if(element<0){
        element=element*(-1);
    }
//    while(element>0){
//        count++;
//        element=element/10;
//    }
    count= (int)Math.log10(element)+1;
    return count;
}
}
