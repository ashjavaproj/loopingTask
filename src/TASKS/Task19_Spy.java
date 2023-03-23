package TASKS;

public class Task19_Spy {
	
	public static void main(String args[])
	{
	int n=401;
	int m=1;
	int s=0;

	for(int i=1; i<n; i++)
	{

	if(n % i==0)
	{
	int r=n%10;
	s=s+i;
	n=n/10;
	m=m*i;
	}
	}

	if (s==m)

	System.out.print("Spy Number");

	else

	System.out.print("Not a Spy Number");
	}

	}


