
public class Print_number_without_loop {

	// we an print the range of number without using the loop in the program,
	//with the help of recursive function. 
	public static void main(String[] args) 
	{
		printNum(1,100);
	}
	// create a method taking 2 parameters
	public static void printNum(int stNum, int endNum)
	{
	    if(stNum<=endNum)
	    {
	        System.out.println(stNum);
	        stNum ++;
	        // here create a recursive function of the same method.
	        printNum(stNum,endNum);
	    }
	}
}
