package jsp.practice;

public class AA {
	int i;
	int j;
	AA(int i, int j) {
		
		this.i = i;
		this.j = j;
	}
    AA() {
		
	}
   public static void add(int a,int b) {
    	System.out.println(a+b);
    }
    
    
    public static void main(String[] args) {
		AA a=new AA(3,8);
		System.out.println(a);
		a.add(7, 60);
	}
	
	
    
}
