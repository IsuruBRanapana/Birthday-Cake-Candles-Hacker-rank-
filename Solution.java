import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
      /*  int temp;
        int birthdayCandle =0;
        for(n=0;n<ar.length-1;n++){   
            for(int x=0;x<ar.length-n-1;x++){
                if(ar[x]>ar[x+1]){
                    temp = ar[x];
                    ar[x]=ar[x+1];
                    ar[x+1]=temp;                   
                }              
            }           
        }
        for(n=0;n<ar.length;n++){
            System.out.print(ar[n]+" ");
        }
        for(n=0;n<ar.length;n++){
            if(ar[n]>= ar[ar.length-1]){
              birthdayCandle += 1;  
            }
        }
        return birthdayCandle;*/
        
  /*      int max=ar[0],b=0,i;
        for(i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];  
            }
            
            if(ar[i] == max){
                
               b += 1; 
            }
        }
      
           
        
        return b;  
    } */
        
           Arrays.sort(ar);
    int count =0;
    for (int i=n-1;i>=0;i--){

        if(ar[i]==ar[n-1]){
            count++;
        }else {
            continue;
        }

    }
     return count;
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
