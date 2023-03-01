import java.util.*; // used to get input from terminal

class basics
{
	public static void main(String [] args)
	{
		System.out.println("Hello! world am java"); // print value 
		
		//2 types of datatypes
		
		//1.primitive = byte(1 byte),short,char(2 byte),boolean(1 byte),int(4),long(8),float(4),double(8)
		//2.non-primitive=string,array,class,oblect,interface
		int a=10;
		int b=5;
		int sum=a+b;
		System.out.println(sum);
		
		// getting input from user
		
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter your name without space");
		String name1=sc.next();// take input untill space
		System.out.println("hi "+name1+" am java");
		
		System.out.println("Enter your name with space");
		String name2=sc.nextLine();// take input full line
		// nextInt,nextFloat
		System.out.println("hi "+name2+" am java");
		
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println(c+d);
 	
	}
}
