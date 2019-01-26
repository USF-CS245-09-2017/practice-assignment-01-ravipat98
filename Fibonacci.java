public class Fibonacci {


public int fibonacci (int n, String type)	
	{
		if (type == "recursive") 
		{
			return fibonacci_recursive(n);
		}
		if (type == "iterative")
		{
			return fibonacci_iterative(n);

		}
	return 0;
	} 

public int fibonacci_recursive(int n)
{
	if (n <= 1) 
    		return n; 
    	else 
    		return fibonacci_recursive(n-1) + fibonacci_recursive(n-2); 
}

public int fibonacci_iterative (int n)

{
	
	if(n <= 1) {
		return n;
	}
		
	int fib = 1;
		
	int previousFib = 1;
		
		for(int i=2; i<n; i++) 
		{
			int temp = fib;
			fib= fib + previousFib;
			previousFib = temp;
		}
	return fib;
	
}

}






