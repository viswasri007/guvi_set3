import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String a=s.next();
		try
		{
			Float.parseFloat(a);
			System.out.println("yes");
		}
		catch(NumberFormatException e)
		{
			System.out.println("no");
		}
	}
}
