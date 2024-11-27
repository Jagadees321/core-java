package interviewpraparation;

import java.util.ArrayList;

public class Stockprofit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		String a="102.5 105.0 20";
		String b="200.0 250.5 182.33";
		String c="99.22 63.25 20";
		
		ArrayList<String> l=new ArrayList<>();
		
		l.add(a);
		l.add(b);
		l.add(c);
		System.out.println(l);
		double res=0;
		for(String d:l) {
			String[] s=d.split(" ");
			res+=(Double.parseDouble(s[1])-Double.parseDouble(s[0]))*Double.parseDouble(s[2]);
		}
		System.out.println(res);
		

	}

}
