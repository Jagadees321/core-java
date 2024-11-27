package jsp.practice;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable i=new Immutable(5);
	
        System.out.println(i.getradius());
        Immutable s=i.setradius(6);
        System.out.println(s.getradius());
        
        
	}
        

}
