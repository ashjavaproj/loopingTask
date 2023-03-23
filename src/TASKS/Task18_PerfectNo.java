package TASKS;

public class Task18_PerfectNo {

	public static void main(String args[])
	{
	int n=4;
	//int m=1;
	int s=0;

	for(int i=1; i<n; i++)
	{

	if(n % i==0)
	{
	//m=m*i;
	s=s+i;
	}
	}

	if (s==n)

	System.out.print("Perfect Number");

	else

	System.out.print("Not a Perfect Number");
	}

	}


