import java.io.*;
import java.util.*;
import java.lang.*;
class number
{	
	int no,count=0;
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
		count++;
		}
		
	}
	public void dispay()
	{

		System.out.println(" number of digit is :--"+count);
	}
	public static void main(String args[])
	{
		number  a = new number();
		a.input();
		a.countt();
		a.dispay();
	}
}