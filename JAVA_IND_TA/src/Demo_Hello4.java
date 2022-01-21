
public class Demo_Hello4 
{

	
	public int age;
	
	public static void main(String a[])
	{
	
	Demo_Hello4 DH3=new Demo_Hello4();
	DH3.age=18;
	DH3.display();
			
	}
	
	
	public void display()
	{
		System.out.println("Welcome to Java World");
		System.out.println("This is an Example of Class and Objects");
		System.out.println("The Age is "+age);
		
		
		
		if(age>=18)
		{
			System.out.println("Major");
		}
		else
		{
			System.out.println("Minor");
		}
		
		
		
		
	}
	
	
	
	

}
