package com.test;

public class PythagoreanTriplet {
	
	public static void main(String args[])
	{
		int ar[] = { 3, 1, 4, 6, 5 }; 
        int ar_size = ar.length; 
		PythagoreanTriplet pythagoreanTriplet=new PythagoreanTriplet();
		System.out.println("istriplet"+pythagoreanTriplet.isTriplet(ar, ar_size));
	}

	public boolean isTriplet(int arr[], int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=j;k<n;k++)
				{
					int x=arr[i]*arr[i];
					int y=arr[j]*arr[j];
					int z=arr[k]*arr[k];
					
					System.out.println("x="+x+"");
					System.out.println("y="+y);
					System.out.println("z="+z);
					
					if(x==y+z || y==x+z || z==x+y)
					{
						return true;
					}
				}
			}
		}
		
	  return false;	
	}
}
