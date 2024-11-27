package geekforgeek;

public class IsArraySubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         long[] a={11, 1, 13 ,21, 3 ,7};
         long[] a2={11, 3, 7, 1};
         System.out.println(isSubset(a,a2));
	}
	public static String isSubset( long a1[], long a2[]) {
        for(long n1:a2){
            if(!found(a1,n1)){
            	
                return "No";
            }
        }
        return "Yes";
        
    }
    
    public static boolean found(long a[],long k){
        for(long n:a){
            if(n==k)
            return true;
        }
        return false;
            
    }

}
