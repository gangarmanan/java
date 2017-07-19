import java.io.*;
import java.util.*;
import java.lang.*;
class number1
{	
	int no,count=0,odd=0,even=0;
	public void  input()
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of elemnts");
		no=sc.nextInt();
	}
	public void countt()
	{
		if(no<0)
		{
			no=no*-1;
		}
		else if(no==0)
		{
			no=1;
		}
		while(no>0)
		{
			no=no/10;
		if(no%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
			count++;
		}
		
	}
	public void dispay()
	{

		System.out.println(" number of digit is :--"+count);
		System.out.println(" number of even is :--"+even);
		System.out.println(" number of odd is :--"+odd);
	}
	public static void main(String args[])
	{
		number1  a = new number1();
		a.input();
		a.countt();
		a.dispay();
	}
}