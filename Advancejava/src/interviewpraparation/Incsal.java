package interviewpraparation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Incsal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ArrayList<EmpSalInc> a=new ArrayList<>();
	    a.add(new EmpSalInc("jagga",23,20000));
	    a.add(new EmpSalInc("yuvi",27,20000));
	    a.add(new EmpSalInc("pavan",21,20000));
	    a.add(new EmpSalInc("mukesh",23,20000));
	    a.add(new EmpSalInc("hardik",28,20000));
	    List<EmpSalInc> emp=a.stream().map(e->{
	    	if(e.getAge()>=25) {
	    		e.setSal(e.getSal()*1.4);
	    	}
			return e;
	    }).collect(Collectors.toList());
	    for(EmpSalInc b:emp) {
	    	System.out.println(b);
	    }
	    

	}

}
