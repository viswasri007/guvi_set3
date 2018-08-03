import java.util.*;
import java.lang.*;
import java.io.*;

class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n<60)
		System.out.println("0 "+n);
		else
		{
			for(int i=60;i<n;i=i+60)
			{
				for(int j=1;j<60;j++)
				{
					if((i+j)==n)
					System.out.print(i/60+" "+j);
				}
			}
			
			
		}
	}
}
