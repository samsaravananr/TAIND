
public class Demo_Hello6 
{

	
	public int vAge;
	public String vName;
	
	
	public static void main(String a[]) throws InterruptedException
	{
	
	Demo_Hello6 DH3=new Demo_Hello6();
	DH3.vAge=0;
	DH3.vName="sam";
	DH3.display();
	
	
			
	}
	
	
	public void display() throws InterruptedException
	{
		System.out.println("Welcome to Java World");
		Thread.sleep(1000);
		System.out.println("This is an Example of Class and Objects");
		Thread.sleep(1000);
		System.out.println("The Age is "+vAge);
		Thread.sleep(1000);
		
		// Age range is between 0 to 18 then it should print minor
		// Age range is between 19 to 150 then it should print major
		// Age range is above 150 then it should print You are a legend
		
		// Logical operator --&& || !
		// Comparison Operator , < > <= >= == !=
		
		for (int i=0;i<3;i++)
		{
			
		
		if(vAge<=18 && vAge >=1)
		{
			System.out.println("Minor");
		}
		else if (vAge >=19 && vAge <=150)
		{
			System.out.println("Major");
		}
		else if (vAge>=151)
		{
			System.out.println("You are a legend");
		}
		else if (vAge==0)
		{
			System.out.println("You are new born.. Come Next Year");
		}
		else
		{
			System.out.println("Invalid Age");
		}
		System.out.println("---------------------------------------------------------------");
		}
		
		Thread.sleep(1000);
		//if (vName.contains("Sam"))
		if (vName.equalsIgnoreCase("Sam"))
		{
			System.out.println("You are Authorised");
		}
		
		else
		{
			System.out.println("You are NOT Authorised Person");
		}
		
	}
	
	
	
	

}
