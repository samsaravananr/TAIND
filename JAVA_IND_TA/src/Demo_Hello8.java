class Demo9
{
	public static void input()
	{
		System.out.println("This is input Method");
	}
}




public class Demo_Hello8 {

	
	
	static int age=10;
	static final String name="Sam"; 
	
	public static void input()
	{
		System.out.println("This is input Method inside Hello8 Class");
	}
	
	
	public static void main(String[] args) 
	{
	
		//name="Saravanan R";
		age=20;
		
		// Static methods can use only static variables or functions
		System.out.println("Age is "+age);
		System.out.println("Name is "+name);
		
		//Demo_Hello8 D8=new Demo_Hello8();
		//D8.input();
		
		//Static methods or variable can be called by the class name itself 
		Demo9.input();
		//input();
		
		

	}

}
