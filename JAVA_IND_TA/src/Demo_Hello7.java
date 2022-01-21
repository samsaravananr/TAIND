
public class Demo_Hello7 
{

	
	public int vAge;
	public String vName;
	
	
	public static void main(String a[]) throws InterruptedException
	{
	
		
		//for (intilization; Condition; Increament / Decreament)
		//for (intilization; Condition; Increament / Decreament);
		
		
		for (int i=1;i<=10;i++)
		{
			System.out.println("Number is : "+i);
		}
		
		System.out.println("---------------------------------------------");
		
		for (int i=10;i>=1;i--)
		{
			System.out.println("Number is : "+i);
		}
		
		System.out.println("---------------------------------------------");
		
		for (int i=1;i<=10;i=i+2)
		{
			System.out.println("Number is : "+i);
		}
		
		System.out.println("---------------------------------------------");
		
		int i;
		
		for (i=1;i<=10;i++);
		{
			System.out.println("Number is : "+i);
		}
	
		i=1;
		System.out.println("---------------------------------------------");
		while (i<=10)
		{
			System.out.println("From While Loop"+i);
			i++;
		}
		System.out.println("---------------------------------------------");
		
		//While Loop --> Entry Check
		//Do while Loop --> Exit Check (IF the condition is false it will still execute one time
		
		do
		{
			System.out.println("From Do while Loop"+i);
			i++;
		}while (i<=20);
		
		
			
	}
	
	
		
	}
	
	
	
	


