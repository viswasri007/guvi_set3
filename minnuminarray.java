import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, min;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[] = new int[n];
    for(int i = 0; i < n; i++)
    {
            a[i] = s.nextInt();
    }
    min = a[0];
    for(int i = 0; i < n; i++)
    {
       if(min > a[i])
         {
                min = a[i];
         }
     }
        System.out.println(min);
	}
}
