
public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		// Armstrong number is basically the sum of cube of every digit
		//eg: 123 => 1*1*1 + 2*2*2 + 3*3*3 =36 hence this is not an armstrong number
		
		checkArmstrong(2);

	}
	
	public static void checkArmstrong(int num)
	{
		int temp = num;
		int ref;
		int sum=0;
		
		while(num>0)
		{
			ref = num%10;
			num = num/10;
			sum = sum + (ref*ref*ref);
		}
		
		if(sum==temp)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}

}
