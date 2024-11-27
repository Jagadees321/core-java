package basicprograms;

public class Demo {
	public static void main(String[] args) {
		String s = "-3*26";
		String substring = s.substring(1);
		String[] sp = substring.split("[*+-/]");
		int i = Integer.parseInt(sp[0]);
		int j = Integer.parseInt(sp[1]);
		System.out.println(i + " " + j);
		if (s.charAt(0) == '+') {
			i = +(i);
		} else {
			i = -i;
		}
		
		for (int k = 1; k < s.length(); k++) {
			if (!Character.isDigit(s.charAt(k))) {
				switch (s.charAt(k)) {
				case '-':
					System.out.println(i - j);
					break;
				case '*':
					System.out.println(i * j);
					break;
				case '+':
					System.out.println(i + j);
				case '/':
					System.out.println(i / j);
				default:
					throw new IllegalArgumentException("Unexpected value: " + s.charAt(i));
				}
				break;
			}
			
		}
		
	}
}
