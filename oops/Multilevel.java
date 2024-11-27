class Phone
{
	void call()
	{
		System.out.println("call connected");
	}

}
class Cameraphone extends Phone
{ 
	void takephoto()
	{
		System.out.println("captured photo");
	}
}
class Smartphone extends Cameraphone
{ 
	void installapp()
	{
		System.out.println("app installed");
	}
}



class Multilevel 
{
	public static void main(String[] args) 
	{
		Phone p1=new Phone();
		p1.call();
	
		System.out.println("-----------------------------");
		Cameraphone cp=new Cameraphone();
		cp.call();
		cp.takephoto();
		System.out.println("-----------------------------");
		Smartphone sp=new Smartphone();
		sp.call();
		sp.takephoto();
		sp.installapp();
		

	
	}
}
