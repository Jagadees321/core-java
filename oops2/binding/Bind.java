class Car
{
	void start(){}
	void speed(){}
	void brake(){}
}
class Audi extends Car
{
	void start(){
		System.out.println("start Audi");
	}
	void speed(){
		System.out.println("speed up Audi");
	}
	void brake(){
		System.out.println("stop Audi");
	}
}
class Bmw extends Car
{
	void start(){
		System.out.println("start Bmw");
	}
	void speed(){
		System.out.println("speed up Bmw");
	}
	void brake(){
		System.out.println("stop Bmw");
	}
}
class Drive
{
	void drive(Car c)
	{
		c.start();
		c.speed();
		c.brake();
	}
}
class  Bind
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Drive d=new Drive();
		d.drive(new Bmw());
		d.drive(new Audi());
	}
}
