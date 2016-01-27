import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        int len=0;
        int seq[]=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int low=1;
            int high=len;
            int pos=0;
            while(low<=high){
                int mid=(int)Math.ceil((low+high)/2);
                if(a[seq[mid]]<a[i]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            pos=low;
            seq[pos]=i;
            if(pos>len){
                len=pos;
            }
        }
        System.out.println(len);        
    }
}
  
