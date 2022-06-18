class Demo
{
	
	Demo()
	{
	    this(5);
	   System.out.println("Siddhant");
	}
	{
		System.out.println("Instance");
	}	
	
	Demo(int a)
	{
		this(10,20);
	   System.out.println("Siddhant "+a);
	}
	Demo(int a,int b)
	{
		int c = a+b;
	   System.out.println("Siddhant "+c);
	}

	public static void main(String [] args)
	{
		Demo d = new Demo();
		//Demo d1 = new Demo(10);
		//Demo d2 = new Demo(10,10);
	}


}