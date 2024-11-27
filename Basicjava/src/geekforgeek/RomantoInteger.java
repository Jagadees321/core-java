package geekforgeek;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=0;
		String str="M";
        Map<Character,Integer> m=new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        for(int i=0;i<str.length();i++){
            int x=m.get(str.charAt(i));
            int y=0;
            if(i<str.length()-1){
                y=m.get(str.charAt(i+1));
            }
            if(x<y){
                res+=y-x;
                i++;
            }else{
                res+=x;
            }
        }
       System.out.println(res);

	}

}
