package arrays1;

public class Matrixleetcode {
	
	public static void main(String[] args) {
		int [][] a= {{1,5,9},{10,15,168},{27,28,29}};
		System.out.println(isarrayssortedinmatrix(a));
	}
	
	public static boolean isarrayssortedinmatrix(int[][] a) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length-1;j++) {
				if(i<a.length-1) {
					if(a[i+1][0]<a[i][a[i].length-1]) {
						return false;
					}
				}
				if(a[i][j]>a[i][j+1]) {
					return false;
				}
			}
		}
		return true;
	}

}
