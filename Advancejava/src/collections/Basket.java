package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Basket {
    ArrayList<Fruits> a=new ArrayList<>();
    int c=0;
	public static void main(String[] args) {
		Basket bs=new Basket();
		bs.add();
		bs.add();
		//bs.add();
		//bs.seebasket();
		//bs.searchFruit();
		//bs.emptybasket();
		bs.seebasket();
		bs.removeFruit();
		bs.seebasket();


	}
	
	public void add() {
		System.out.println("enter name:");
		String name=new Scanner(System.in).next();
		System.out.println("enter price:");
		int price=new Scanner(System.in).nextInt();
		a.add(new Fruits(name,price));
		c++;
	}
	public void searchFruit() {
		System.out.println("enter fruit");
		String name=new Scanner(System.in).next();
		for(Fruits b: a) {
           if(name.equals(b.name)) {
        	   System.out.println("found");
        	   return;
           }

		}
		System.out.println("not found");
	
	}
	public void seebasket() {
		for(Fruits b: a) {
			System.out.println(b);
		}
	}
	public void removeFruit() {
		System.out.println("enter fruit");
		String name=new Scanner(System.in).next();
		for(int i=0;i<a.size();i++) {
			if(name.equals(a.get(i).name)) {
				a.remove(i);
				System.out.println("item removed");
				return;
			}
		}
		System.out.println("fruit not found");
	}
	public void emptybasket() {
		a.clear();
	}
	

}
