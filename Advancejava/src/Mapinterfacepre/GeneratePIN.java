package Mapinterfacepre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GeneratePIN {
    public static void main(String[] args) {
        int input1 = 1274;
        int input2 = 5283;
        int input3 = 1937;
        int pin = generatePIN(input1, input2, input3);
        System.out.println("Generated PIN: " + pin);
        System.out.println(findMinFrequencyDigit(1274,5283,1937));
    }

    public static int generatePIN(int input1, int input2, int input3) {
        int thousandsDigit = findLargestDigit(input1, input2, input3);
        int hundredsDigit = findSmallestDigit(input1, input2, input3);
        int tensDigit = findModeTensDigit(input1, input2, input3);
        int unitsDigit = findMinFrequencyDigit(input1, input2, input3);

       
        int pin = thousandsDigit * 1000 + hundredsDigit * 100 + tensDigit * 10 + unitsDigit;
        return pin;
    }

    public static int findLargestDigit(int num1, int num2, int num3) {
       
    	List<Integer> l=Arrays.asList(num1,num2,num3);
        List<Integer> l2=new ArrayList<>();
        for(int a:l) {
        	while(a>0) {
        		int r=a%10;
        		l2.add(r);
        		a=a/10;
        	}
        }
        int max=0;
        for(int a:l2) {
            if(a>max) max=a;	
        }
        return max;
    }

    public static int findSmallestDigit(int num1, int num2, int num3) {
       
    	List<Integer> l=Arrays.asList(num1,num2,num3);
        List<Integer> l2=new ArrayList<>();
        for(int a:l) {
        	while(a>0) {
        		int r=a%10;
        		l2.add(r);
        		a=a/10;
        	}
        }
        Collections.sort(l2);
        return l2.get(0);
    }

    public static int findModeTensDigit(int num1, int num2, int num3) {
        
//        int[] tensDigits = {(num1 / 10) % 10, (num2 / 10) % 10, (num3 / 10) % 10};
//        Map<Integer, Integer> digitFrequency = new HashMap<>();
//        int maxFrequency = 0;
//        int modeDigit = 0;
//
//        for (int digit : tensDigits) {
//            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
//            int frequency = digitFrequency.get(digit);
//            if (frequency > maxFrequency || (frequency == maxFrequency && digit > modeDigit)) {
//                maxFrequency = frequency;
//                modeDigit = digit;
//            }
//        }

 //       return modeDigit;
    	
        List<Integer> l=Arrays.asList(num1,num2,num3);
        List<Integer> l2=new ArrayList<>();
        for(int a:l) {
        	while(a>0) {
        		int r=a%10;
        		l2.add(r);
        		a=a/10;
        	}
        }
        
        int count = 0;
        int maxelement=0;
        for(int a:l2) {
        	
        	int countele=Collections.frequency(l2, a);
        	if(countele>count && maxelement<a) {
        		count=countele;
        		maxelement=a;
        		
        	}
        }
        return maxelement;
    }

    public static int findMinFrequencyDigit(int num1, int num2, int num3) {
        
    	List<Integer> l=Arrays.asList(num1,num2,num3);
        List<Integer> l2=new ArrayList<>();
        for(int a:l) {
        	while(a>0) {
        		int r=a%10;
        		l2.add(r);
        		a=a/10;
        	}
        }
        
        int count = 0;
        int minele=l2.get(0);
        for(int a:l2) {
        	
        	if(Collections.frequency(l2, a)<2) {
        		if(a<minele) {
        			minele=a;
        		}
        	}
        }
        return minele;
    }
}

