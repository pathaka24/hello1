import java.util.*;

class Fibonacci  
{
	public static long fib(long n)
	{
		int f0= 0;
		int f1 = 1;
		int f2 = 1;
		if (n == 0)
		{
			return f0;
		}
		else if (n == 1)
		{
			return f1;
		}
		else if(n== 2)
		{
			return f2;
		}
		for (int i = 3;i<=n ;i++ )
		{
			f0 = f1;
			f1 = f2;
			f2 = f0+f2;
			System.out.println("Enter Index for Fibonacci: " +f2);
		}
		return f2;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Index for Fibonacci: ");
		int num = in.nextInt();
		fib(num);
        System.out.println("Your index is " +num+ " Fibonacci " +fib(num));
	}  
}
