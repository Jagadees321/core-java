package interviewpraparation;

public class EmpSalInc {
	private String name;
	private int age;
	private double sal;
	@Override
	public String toString() {
		return "EmpSalInc [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public EmpSalInc(String name, int age, int sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	

}
