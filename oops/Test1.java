import java.util.*;
class Cricket
{
	String name;
	String role;
	int score;
	Cricket(String n,String r,int s)
	{
		name=n;
		role=r;
		score=s;
	}
	void display()
	{
		System.out.println("name="+name+"\trole="+role+"\tscore="+score);
	}

}
class F
{
	static Cricket create()
	{
		Scanner sc= new Scanner(System.in);
	    System.out.println("cricketer name");
		String n=sc.nextLine();
		System.out.println("cricketer role");
		String r=sc.nextLine();
		System.out.println("cricketer score");
		int s=sc.nextInt();
		return new Cricket(n,r,s);
	}
}


class  Test1
{
	public static void main(String[] args) 
	{
		//Cricket c1=F.create();
		//c1.display();
		Cricket c2=F.create();
		//c1.display();
		c2.display();
	}
}