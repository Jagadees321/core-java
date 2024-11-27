package interviewpraparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emptest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp("jagga","mpl");
		Emp e2=new Emp("supriya","bngr");
		Emp e3=new Emp("veky","mpl");
		Emp e4=new Emp("jaya","bngr");
		List<Emp> emp=Arrays.asList(e1,e2,e3,e4);
//		Map<String,List<Emp>> g=emp.stream().collect(Collectors.groupingBy(Emp::getcity));
		
	}

}
