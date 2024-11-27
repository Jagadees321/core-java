package com.jsp.arrays;

public class Spiral {

	public static void main(String[] args) {
		
		int s=5;
		int[][] a=new int[s][s];
		char direction='r';
		int r=0;
		int c=-1;
		for(int i=1;i<=s*s;i++) {
			switch(direction) {
			case 'r':{
				c++;
				a[r][c]=i;
				if(c==s-1 || a[r][c+1]!=0) direction='d';
				break;
			  }
			
			case 'd':{
				r++;
				a[r][c]=i;
				if(r==s-1 || a[r+1][c]!=0) direction='l';
				break;
			}
			
			case 'l':{
				c--;
				a[r][c]=i;
				if(c==0 || a[r][c-1]!=0) direction='u';
				break;
				
			}
			
			
			case 'u':{
				r--;
				a[r][c]=i;
				if(r==0 || a[r-1][c]!=0) direction='r';
				break;
			}
			
				
			}
		}
		//System.out.println(Arrays.toString(int[]a));
		for(int[] ab :a) {
			for(int y:ab) {
				System.out.print(y+"\t");
			}
			System.out.println();
			
		}

	}

}
