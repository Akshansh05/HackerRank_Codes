import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args)throws IOException {
        int i,t;
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        t=Integer.parseInt(br.readLine());
        String s1[]=new String[10000];
   for( i=0;i<t;i++)
   { 
    s1[i]=br.readLine();
   }
  for(i=0;i<t;i++)
  { int j,n,count=0,count1=0; 
    char r[]=new char[10000];
    char k[]=new char[10000];
for(j=0;j<s1[i].length();j++)
     {
         if((j%2)==0)
         { 
           r[count]=s1[i].charAt(j);
             count++;
         }
         else{
           k[count1]=s1[i].charAt(j);  
           count1++;
         }
     }
      for(n=0;n<count;n++)
          System.out.print(r[n]);
   System.out.print(" ");
    for(n=0;n<count1;n++)
          System.out.print(k[n]);
   System.out.println();
  }
        
    }
}
