import java.util.Scanner;

public class PrimeNumber {

	//First of all what is a prime number?
	// The number which can be divided only by itself is a prime number
	
	public static void main(String[] args) 
	{
		
    	//checkPrime method returns a boolean value 
    	boolean opt = checkPrime(13);
    	//condition to print the output
    	if (opt)
    	System.out.println("Prime number");
    	
    	else
    	System.out.println("not a Prime Number");
    	
    	checkPrime(1, 100);
	

	}
	
	// method to check a single argument ie a single input
	
	public static boolean checkPrime(int num)
	{
		
		if (num<=1)
		{
			return false;
		}
		
		else
		{
			for(int i = 2; i<num; i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
			return true;
		}	
	}
	
	//Overloaded the above method method with 2 arguments to check between the range
	
	public static void checkPrime(int start, int end)
	{
		for(int i=start; i<=end; i++)
		{
			if(checkPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}

}
