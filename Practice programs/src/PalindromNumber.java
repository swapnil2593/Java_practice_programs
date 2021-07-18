import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args)
	{
		//create scanner class ref to enter a number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		//calling the palindrome check method
		palindromeCheck(sc.nextInt());
		

	}
	
	public static void palindromeCheck(int num)
	{
		//logic to reverse a number
		int org_num = num;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num= num/10;
			
		}
		
		//condition to check if the reverse number is same as original number
		if (rev==org_num)
		{
			System.out.println(org_num + " is a palindrome number");
			
		}
		else
		{
			System.out.println(org_num + " is not a palindrome number");
		}
		
	}

}
