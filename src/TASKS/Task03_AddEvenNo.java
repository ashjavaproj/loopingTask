package TASKS;

public class Task03_AddEvenNo 
	{
	public static void main(String args[])
	{

	int count=0;

	for(int i=1;i<=100;i++)
	{
	if(i%2==0)
	{

	count=i+count;
    }		
    }
	System.out.println("Addition of Even No is " +count);
    }
	}


