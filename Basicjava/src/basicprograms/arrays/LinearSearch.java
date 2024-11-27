package basicprograms.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,2,3,4,5,6};
        System.out.println(linear(a, 3));
	}
	
	public static boolean linear(int[] a,int k) {
		for(int b:a) {
			if(b==k) return true;//k=3
		}
		
		return false;
	}

}
