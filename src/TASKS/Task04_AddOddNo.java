package TASKS;

public class Task04_AddOddNo {
	
	public static void main(String args[])
	{

	int a=0;
	for(int i=1;i<=100;i++)
	{

	if(i%2!=0)
	{

	 	a=i+a;
	}

	}
	System.out.println("Addition of Odd No is " +a);
	}

	}


