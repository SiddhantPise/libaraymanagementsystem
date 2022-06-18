class A
{
	private int a;
	void set(int a)
	{
		this.a = a;
	}
	int getA()
	{
		return a;
	}
}

class B
{
	public static void main(String [] args){

	A obj = new A();
	obj.set(10);
	int ans = obj.getA();
	System.out.println("Value of a : "+ans);
	}
	
}