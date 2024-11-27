package Mapinterfacepre;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashmap {

	public static void main(String[] args) {
		Map<String,Integer>s=new HashMap<>();
		s.put("a", 6);
		s.put("b", 2);
		s.put("c", 5);
		s.put("d", 3);
		
		LinkedHashMap<String,Integer>m=s.entrySet().stream().sorted((e1,e2)->{ return e1.getValue()- e2.getValue();})
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        System.out.println(m);
        
	}

}
