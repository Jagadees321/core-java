package basicprograms;

public class Copycons {
	
	int i;
	int j;
	

	public Copycons(int i, int j) {
		
		this.i = i;
		this.j = j;
	}
	Copycons(Copycons a){
		this.i=a.i+a.i;
		this.j=++this.i;
	}


	public static void main(String[] args) {
		Copycons a=new Copycons(7,8);
		System.out.println(a.i);
		System.out.println(a.j);
		Copycons b=new Copycons(a);
		System.out.println(b.i);
		System.out.println(b.j);
		
		
		
		
		

	}

}
