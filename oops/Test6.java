class Box
{
	int height;
	int width;
	int length;
	Box()
	{ 
		System.out.println("excuted");

	}
	Box(int n)
	{
		height=width=length=n;
	}
	Box(int h,int w,int l)
	{
		height=h;
		width=w;
		length=l;
	}
	void display()
	{
		System.out.println("Hello "+height);
		System.out.println("Hello !"+width);
		System.out.println("length"+length);
	}
}




class  Test6
{
	public static void main(String[] args) 
	{
		Box b1=new Box();
		Box b2=new Box(5);
		Box b3=new Box(3,4,5);
		b1.display();
		b2.display();
		b3.display();

	}
}
