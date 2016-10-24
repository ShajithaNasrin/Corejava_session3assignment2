class Name
{
	public void names()
	{
		boolean same=true;
		boolean same1=false;

	
		
		System.out.print("Enter the First Name:");
		String s1=System.console().readLine();

		System.out.print("Enter the Second Name:");
		String s2=System.console().readLine();

		if(s1.equals(s2))
		{
			System.out.println("The string is "+same);
		}
		else
		{
			System.out.println("The string is "+same1);
		}
	}
}
class StringBoolean
{
	public static void main(String[] arg)
	{
		Name n=new Name();
		n.names();
	}
}