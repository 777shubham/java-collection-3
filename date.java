import java.util.Scanner;
class check
{
	private String date;
	private int dd, mm, yyyy;
	
	check(String date)
	{
		this.date = date;
	}
	
	String calculate()
	{
		String date_english = new String();
		int i, pos1 = 0, pos2 = 0;
		for(i=0;i<date.length();i++)
		{
			if(date.charAt(i) == '/')
			{
				pos1 = i;
				break;
			}
		}
		for(i=pos1+1;i<date.length();i++)
		{
			if(date.charAt(i) == '/')
			{
				pos2 = i;
				break;
			}
		}
		dd = Integer.parseInt(date.substring(0,pos1));
		mm = Integer.parseInt(date.substring(pos1+1,pos2));
		yyyy = Integer.parseInt(date.substring(pos2+1,date.length()));
		String date1[]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","thirty","thirty one"};
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		if(dd>31||mm>12)
		{
			String in="INVALID ENTERED DATE";
			return in;
		}
		date_english = date1[dd-1] + "-" + months[mm-1] + "-" + yyyy;
		return date_english;
	}
}
public class date
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a date in DD/MM/YYYY format : ");
		String date = sc.next();
		check obj = new check(date);
		System.out.println("\nThe entered date in english: " + obj.calculate());
		System.out.println();
		sc.close();
	}	
}