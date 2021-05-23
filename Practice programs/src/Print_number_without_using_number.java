
public class Print_number_without_using_number {

	public static void main(String[] args) 
	{
		//use ASCII values
		
		int b = 'd'; // ASCII value of d is 100
		
		int a = 'd'/'d'; //divide 100/100 gives you 1
		
		// call the function or you can create the loop in 
		// main method as well.
		
		printNum(a, b);
		

	}
	
	public static void printNum(int a, int b)
	{
		//create a simple for loop
		
		for(int i = a; i <= b;i ++)
		{
			System.out.println(i);
		}
	}

}
