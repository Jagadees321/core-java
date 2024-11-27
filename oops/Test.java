class Rec
{
	int length;
	int breadth;
	void initiazation(int length,int breadth)
	{
		 this.length=length;
		 this.breadth=breadth;
		 System.out.println("excuted");
	}
	void area(){
		int a=(this.length * this.breadth);
		System.out.println(a);
	}
	void perimeter(){
		int p=2 * (this.length * this.breadth);
		System.out.println("perimeter"+p);
	}

}




class  Test
{
	public static void main(String[] args) 
	{
		Rec r1=new Rec();
		r1.initiazation(10,30);
		r1.area();
		r1.perimeter();
	}
}
