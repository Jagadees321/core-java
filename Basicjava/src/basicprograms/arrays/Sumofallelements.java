package basicprograms.arrays;

public class Sumofallelements {
    public static void main(String[] args) {
		int[] a= {10,2,3,4,5,6,7,8,9};
        int sum=0;
        
        
        
        
//        for(int b:a) {
//        	sum+=b;
//        }
        for(int i=0;i<a.length;i++) {
        	sum+=a[i];
        }
        
        
		System.out.println(sum);
	}
}
