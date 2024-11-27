package jsp.practice;

//import java.util.Scanner;

public class Arraylist {
	private Object[]a;
	private int p=0;
	public Arraylist(){
		a=new Object[5];
		p=0;
		
	}
	public void add(Object n) {
		if((p>=(a.length))) increase();
		a[p++]=n;
	}
	private void increase() {
		Object[] temp=new Object[a.length +2];
		System.arraycopy(a, 0, temp, 0, a.length);
		a=temp;
		
	}
	public int size() {
		return p;
	}
	public Object get(int ind) {
		if(ind>=a.length || ind<=-1) {
			throw new IndexOutOfBoundsException();
		}
		return a[ind];
	}
	
	public void change(int ind,Object e) {
		if(ind>=a.length || ind<=-1) {
			throw new IndexOutOfBoundsException();
		}
		if(p>=a.length) increase();
		for(int i=a.length-1;i>=0;i--) {
			a[p+1]=a[p];
		}
		a[ind]=e;
		p++;
	}
	public void removeobj( Object e) {
		
		int ind=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==e) {
				ind=i;
			}
		}
		
		for(int i=ind+1;i<size();i++) {
			a[i-1]=a[i];
		}
		p--;
		a[p]=null;
		
	}
	public void remove(int ind) {
		if(ind>=a.length || ind<=-1) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=ind+1;i<size();i++) {
			a[i-1]=a[i];
		}
		p--;
		a[p]=null;
		
	}
	
	public static void main(String[] args) 
	{
		Arraylist a1=new Arraylist();
		a1.add(12);
		a1.add(23);
		a1.add(6);
		a1.add(7);
		a1.add("jagga");
		a1.add("royal");
		a1.add("yuvi");
		//a1.add(89);
		
		a1.change(2, "hi");
		a1.removeobj("hi");
		a1.remove(1);
		for(int i=0;i<a1.a.length;i++) {
			System.out.println(a1.get(i));
		}
	}

}
