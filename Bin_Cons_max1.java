import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0,i,count1=0,result=0;
        int rem[]=new int[500];
        while(n!=0)
        {rem[count] =n%2;
        count++;
         n=n/2;
        }
        for(i=0;i<count;i++)
        { if(rem[i]==0)
        {count1=0;
        }
        else{
            count1++;
        result=Math.max(count1,result);
        }
          }
        System.out.println(result);
        
    }
}
