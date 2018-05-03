import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    public int min,max;
Difference(int []a){
    this.elements=a;
    this.min=a[0];
    this.max=a[0] ;   
}
int diff=0;
public int computeDifference(){
for(int i=0;i<elements.length;i++)
{      if(elements[i]>max)
          max=elements[i];
       if(elements[i]<min)
           min=elements[i];
}
        diff=max-min;
        maximumDifference=Math.abs(diff);   
return maximumDifference;
}
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
