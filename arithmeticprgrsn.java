import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
    static int sumOfAP(int N, int A, int D)
    {
        int sum = 0;
        for (int i = 1; i <=N; i++)
        {
            sum = sum + A;
            A = A + D;
        }
        return sum;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int A=s.nextInt();
		int D=s.nextInt();
		System.out.println(sumOfAP(N,A,D));
	}
}
