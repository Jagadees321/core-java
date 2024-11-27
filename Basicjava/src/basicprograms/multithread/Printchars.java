package basicprograms.multithread;

public class Printchars implements Runnable{

	@Override
	public  void run() {
		
			
		print();
		
	}
	synchronized public  void print() {
		for(char c=65;c<=90;c++) {{
			System.out.println(c);
			System.out.println("====");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
			
		}
		
	}
   
}
