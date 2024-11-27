package com.jsp;

public class Happynum  
{     
    
    public static int isHappyNumber(int num)
    {  
        int rem = 0, sum = 0;  
          
        
        while(num > 0)
        {  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  
    public static boolean Happy(int n) {
    	int result = n;
		while(result != 1 && result != 4){  
            result= isHappyNumber(result);  
        }  
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
          
         
        
    }
    public static int s1(String s) {
		char[]a=s.toCharArray();
		String sum = "";
		int s1 = 0;
		int s2=0;
		for(int i=0;i<s.length();i++) {
			if(a[i]>='0' && a[i]<='9') {
				sum+=""+a[i];	
			}
			
		}
		s1=Integer.parseInt(sum);
		while(s1>0) {
			int r=s1%10;
			s2+=r;
			s1=s1/10;
			
		}
		
		return s2;
	}
	
      
    public static void main(String[] args) {  
       // int l=2;
        //int h=100;
       // for(int i=l;i<=h;i++) {
       // 	if(Happy(i)) {
        	//	System.out.println(i);
        //	}
    	String s="a1b8c4";
    	int n=s1(s);
        if(Happy(n)) {
        	System.out.println("happy num");
        }
        else {
        	System.out.println("not happy num");
        }
          
           
    }  
}  
