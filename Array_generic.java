
import java.util.*;
public class Array_generic
{
	
    public static <t>  void print(t a[])
    {
        
        for(t i:a)
        {
            System.out.println(i+" ");
        }
    }
    public static void main(String ars[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        int n=s.nextInt();
       Integer i[]=new Integer[n];
       Double d[]=new Double[n];
       String s1[]=new String[n];
       System.out.println("Enter Integer value");
       for(int j=0;j<n;j++)
       {
           i[j]=s.nextInt();
       }
       System.out.println("Enter Double value");
        for(int j=0;j<n;j++)
       {
           d[j]=s.nextDouble();
       }
        System.out.println("Enter String value");
         for(int j=0;j<n;j++)
       {
           s1[j]=s.next();
       }
         System.out.println("\nInteger values");
         print(i);
         System.out.println("\nDouble values");
         print(d);
         System.out.println("\nString values");
         print(s1);
         
       
    }
}
