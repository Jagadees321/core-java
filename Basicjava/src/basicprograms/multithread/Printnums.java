package basicprograms.multithread;

public class Printnums extends Thread {
	static int m1(int i) {
		return i;
	}
    public void run() {
    	for(int i=1;i<=10;i++) {
    		System.out.println(m1(i));
    		System.out.println("hello");
    		try {
				Thread.sleep(100);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
    	}
    }
}
