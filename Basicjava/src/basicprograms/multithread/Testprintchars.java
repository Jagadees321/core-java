package basicprograms.multithread;

public class Testprintchars {

	public static void main(String[] args) {
		Runnable r=new Printchars();
		Runnable r1=new Printchars();
		Thread t=new Thread(r);
		Thread t2=new Thread(r1);
		
		
		
		t.start();
		t2.start();

	}

}
