package innerclasses;

public class Ot {
	static int a=9;

	Ot() {
		System.out.println("cons");
	}

	static class In {
		static void  m1() {
			System.out.println(a);
		}
		public static void main() {
			
			In.m1();
		}

	}

	public static void main(String[] args) {
        In.main();
	}

}
