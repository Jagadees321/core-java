package Streams.practiceallquestions;

public class Sumofdigitsusingstream {
	public static void main(String[] args) {
		 String input = "a1b2c3";
		 input.chars().forEach(System.out::println);;

	        int sumOfDigits = input.chars() 
	                               .filter(Character::isDigit) 
	                               .map(Character::getNumericValue) 
	                               .sum(); 

	        System.out.println("Sum of digits: " + sumOfDigits); 
	}

}
