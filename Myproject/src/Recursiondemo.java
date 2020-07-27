
 class Recursiondemo
 {
	public static void main (String[] args) 
	{
    int ret = f(9);
    System.out.println(ret);
		
	}

	static int f(int n)
	{
		if (n == 0)
		{
		return 0;				
		}
	   else if (n == 1)
		{
		return 1;
		}else
		{
		return f(n-1) + f(n-2);
		}
	}
	
}
