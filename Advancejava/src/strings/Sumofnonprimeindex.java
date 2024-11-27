package strings;

public class Sumofnonprimeindex {

	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70,80,90,100};
		System.out.println(sumOfNonPrimeIndexValues(a,a.length-1));

	}
	
	public static int sumOfNonPrimeIndexValues(int input[],int input2) {
		//array
		int sum=0;
		for(int i=0;i<=input2;i++) {
			if(!isPrime(i)) {
				sum+=input[i];
			}
		}
		return sum;
	}
	
	public static boolean isPrime(int n) {
    	if(n<2)return false;
    	for(int i=2;i<=n/2;i++) {
    		if(n%i==0) {
    			return false;
    		}
    		
    	}
    	return true;
    }

}
