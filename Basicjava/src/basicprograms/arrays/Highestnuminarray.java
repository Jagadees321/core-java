package basicprograms.arrays;

public class Highestnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {22,3,4,11,44,88,66};
//        System.out.println(biggestnum(a));
//        System.out.println(smallestnum(a));
        
        System.out.println("sum of odd  "+sumofOddnum(a));
        System.out.println("sum of even "+sumofEvennum(a));
	}
	

	public static int biggestnum(int[] a) {
		int max=a[0];
		for(int b:a) {//66
			if(max<b) {//max=88 b=66
				max=b;//max  update max=b> max=88
			}
		}
		
		return max;
	}
	public static int smallestnum(int[] a) {
		int min=a[0];
		for(int b:a) {
			if(min>b) {
				min=b;
			}
		}
		
		return min;
	}
	public static int sumofOddnum(int[] a) {
		int sum=0;
		for(int b:a) {
			if(b%2!=0)
				sum+=b;
		}
		
		return sum;
	}
	public static int sumofEvennum(int[] a) {
		int sum=0;
		for(int b:a) {
			if(b%2==0)
				sum+=b;
		}
		
		return sum;
	}
	

}
