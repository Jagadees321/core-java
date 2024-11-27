package interviewpraparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emptest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		List<Emp> l=new ArrayList<>();
		l.add(new Emp("jagga","mpl"));
		l.add(new Emp("veky","mpl"));
		l.add(new Emp("jaya","bngr"));
		l.add(new Emp("supriya","bngr"));
		
        Map<String,List<Emp>> m=l.stream().collect(Collectors.groupingBy(Emp::getCity));
        System.out.println(m);
//        List<Emp>b=l.stream().filter((e1)-> e1.name.equals("jagga")).collect(Collectors.toList());
//        System.out.println(b);
//        System.out.println("--------------------------");
//        List<Emp>c= l.stream().filter(e1->e1.name.charAt(0)<'m').collect(Collectors.toList());
//        System.out.println(c);
//        System.out.println("====================================");
//        List<Emp>d =l.stream().filter(e1->e1.name.endsWith("a")).collect(Collectors.toList());
//        System.out.println(d);
	}

}
