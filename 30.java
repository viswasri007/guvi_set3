import java.util.*;
import java.lang.*;
import java.io.*;

class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int h1=s.nextInt();
		int m1=s.nextInt();
		int h2=s.nextInt();
		int m2=s.nextInt();
		int d1=h1-h2;
		int d2=m2-m1;
		if(d1<0 && d2<0) //(d1>0 && d2<0) || (d1<0 && d2>0) )
		System.out.println(-d1+" "+-d2);
		else if(d1<0 && d2>0)
		System.out.println(-d1+" "+d2);
		else if(d1>0 && d2<0)
		System.out.println(d1+" "+-d2);
		else
		System.out.println(d1+" "+d2);
	}
}
