import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a[]=new int[50];
        int b[]=new int[50];
    int n=sc.nextInt();
    int i;
  int  count =n;
   int count1=0;
    for( i=0; i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++){
        if(a[i]==0)
        {
            b[count]=a[i];
            count--;
        }
        else{
            b[count1]=a[i];
            count1++;
        }
        
    }
    for( i=0; i<n;i++)
    {
    System.out.println(b[i]);
    }
    
     }
}
