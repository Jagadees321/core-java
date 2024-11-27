package innerclasses;

public class Methodinnerclass {
    public static void main(String[] args) {
    	Methodinnerclass m=new Methodinnerclass();
    	m.main1();
	}
    public  void main1() {
    	//for static fields
//		class inner{
//			public static void main1() {
//				System.out.println("hello");
//			}
//		}
//		inner.main1();
    	
    	
    	
    	//for non static fields
    	class inner{
			public  void main1() {
				System.out.println("hello");
			}
		}
    	inner i=new inner();
    	i.main1();
	}
}
