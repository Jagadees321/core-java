package basicprograms.arrays;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
		int [] a=new int[3];
		System.out.println(Arrays.toString(a));//object refernce kakunda values print chasthAdi
		//pina line lo value print avuthayi kani values inka decleare chayaledu so default values
		// int primitive kabbati defualt 0
		//size 3 kabbati 3 zeros print avuthayi
		//[0,0,0]
		String s[]=new String[4];
		System.out.println(s);//reference
		System.out.println(Arrays.toString(s));// values but object primitive kadu so null
		// Object ki default value null
		//output [null,null,null,null]
		

	}
}