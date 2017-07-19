import java.io.*;
import java.util.*;
import java.lang.*;
class pattern
{	
	int no,i,j;
	char alpha='A';
	public void  input()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of elemnts :--  ");
		no=sc.nextInt();
	}
	public void n1()	
	{
		for(int i=1;i<=no;i++)
		{	
			for(int j=1;j<=i;j++)	
			{
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
	public void n2()	
	{
		for(int i=no;i>=1;i--)
		{	
			for(int j=1;j<=i;j++)	
			{
				System.out.print(j+" ");
			}
		System.out.println();
		}
	}
	public void n3()	
	{
		for(int i=1;i<=no;i++)
		{	
			char alpha='A';
			for(int j=1;j<=i;j++)	
			{
				System.out.print(alpha+" ");
				alpha++;
			}
		System.out.println();
		}
	}
	public void n4()	
	{
		int count=0;
		for(int i=1;i<=no;i++)
		{	
			if(count%2==0)
			{
				for(int j=1;j<=i;j++)	
				{
				System.out.print(j+" ");
				}
				System.out.println();
				
			}	
			else
			{
				char alpha='A';
				for(int j=1;j<=i;j++)	
				{
					System.out.print(alpha+" ");
					alpha++;
				}
				System.out.println();
			
			
			}
		
			count++;
		}
	}
	public void n5()	
	{
	                int count=0;
		for(int i=no;i>=1;i--)
		{	
			if(count%2==0)
			{
				for(int j=1;j<=i;j++)	
				{
				System.out.print(j+" ");
				}
				System.out.println();
				
			}	
			else
			{
				char alpha='A';
				for(int j=1;j<=i;j++)		
				{
					System.out.print(alpha+" ");
					alpha++;
				}
				System.out.println();
			
			
			}
		
			count++;
		}
	}
	public void n6()	
	{
		int count=0;
		char alpha='A';
		int num=1;
		for(int i=1;i<=no;i++)
		{	
			if(count%2==0)
			{
				for(int j=1;j<=i;j++)	
				{
				System.out.print(num+" ");	
				num++;
				}
				System.out.println();
				
			}	
			else
			{
				
				for(int j=1;j<=i;j++)	
				{
					System.out.print(alpha+" ");
					alpha++;
				}
				System.out.println();
			
			
			}
		
			count++;
		}
	}
	public void n7()	
	{
		int count=0;
		char alpha='A';
		int num=1;
		for(int i=no;i>=1;i--)
		{	
			if(count%2==0)
			{
				for(int j=1;j<=i;j++)
				{
				System.out.print(num+" ");	
				num++;
				}
				System.out.println();
				
			}	
			else
			{
				
				for(int j=1;j<=i;j++)	
				{
					System.out.print(alpha+" ");
					alpha++;
				}
				System.out.println();
			
			
			}
		
			count++;
		}
	}
	public void display()
	{
		System.out.println("next pattern is");	
	}
	public static void main(String args[])
	{
		pattern  a = new pattern();
		a.input();
		a.n1();
		a.display();
		a.n2();
		a.display();
		a.n3();
		a.display();
		a.n4();
		a.display();
		a.n5();
		a.display();
		a.n6();
		a.display();
		a.n7();
		
	}
}