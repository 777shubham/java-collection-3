import java.util.Scanner;
class calculate <t extends Comparable>
{	
	private t arr[];

	
	public void sort( t arr[])
	{
		
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j].compareTo(arr[j+1]) > 0)
				{
					t temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

	public void display(t arr[])
	{
		
		for(t i:arr)
			System.out.println(i + " ");

	}
}

public class sort_generic extends calculate
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = s.nextInt();

		calculate obj = new calculate();
       Integer i[]=new Integer[n];
       Double d[]=new Double[n];
       String s1[]=new String[n];
	   Character c[]=new Character[n];
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
	   System.out.println("Enter Character value");
	     for(int j=0;j<n;j++)
       {
		   char ch=s.next().charAt(0);
            c[j]= ch;
           //c[]=s.nextChar();
       }
	   
	   
         System.out.println("Sorted Integer values");
         obj.sort(i);
		 obj.display(i);
		 
         System.out.println("Sorted Double values");
         obj.sort(d);
		 obj.display(d);
		 
         System.out.println("Sorted String values");
         obj.sort(s1);
		 obj.display(s1);
		 
		 System.out.println("Sorted Character values");
         obj.sort(c);
		 obj.display(c);
		
		System.out.println();
	}
}