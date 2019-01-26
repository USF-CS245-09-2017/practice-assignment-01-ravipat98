public class Factorial {

public int factorial (int n, String type)
{
	if (type == "recursive") 
		{
			return factorial_recursive(n);
		}
		if (type == "iterative")
		{
			return factorial_iterative(n);

		}
		return 0;
}

public int factorial_recursive(int n)
{
	if(n == 1)
	{ 
		return 1;
	}
    else 
    	{
    		return n * factorial_recursive(n-1);
    	}


}

public int factorial_iterative(int n)
{
	int result=1;
	int i=1;
		
	while(i<=n)
	{
		result=result * i;
		i++;
	}
		
	return result;
}


}