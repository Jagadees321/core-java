package jsp.practice;

import java.util.Arrays;

//import java.util.Iterator;

public class Ij {

	public static void main(String[] args) {
		int []a= {5,4,2,7,9,6,8};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
		
		
		}
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
	}

	

}
