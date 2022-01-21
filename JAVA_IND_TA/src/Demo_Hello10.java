import java.io.FileNotFoundException;

public class Demo_Hello10 {

	
	public static int a,b,c;
	
	public static void main(String[] args) 
	{
	
		// Exception Handling is --- To Handle the run time error
		
		//try and catch
		
		
		
		
		StartTest();
		add();
		div();
		EndTest();
		
		

	}
	
	
	public static void add()
	{
		a =30;
		b =20;
		c=a+b;
		System.out.println("The output is :"+c);
		
	}
	
	
	public static void div()
	{
		a =10;
		b =2;
		
		try
		{
		c=a/b;
		System.out.println("The output is :"+c);
		}
		catch (ArithmeticException AE)
		{
			System.out.println("Number cannot be divided by ZERO");
		}
		catch (ArrayIndexOutOfBoundsException FE)
		{
			System.out.println("Number cannot be divided by ZERO");
		}
		
		finally 
		{
			System.out.println("CLear Browser Cache");
		}
		
		
		
	}
	
	public static void EndTest()
	{
		System.out.println("Closing the Browser");
	}
	
	public static void StartTest()
	{
		System.out.println("Opening the Browser");
	}
	
	

}


