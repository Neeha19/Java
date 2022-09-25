package loop;

public class Example1 {
	//static variable
	static int a,b,c;//0. static variables are executed very first
	static {
		System.out.println("Inside Static block");// 1.it is executed first even before main
		a=0;
		b=30;
		c=40;
	}
	static void display() {
		
		System.out.println("Inside static method");//
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	int m,n,o; 
	{
		//non static block or instance initialization block
		System.out.println("inside non static block");
		a=40;// able to access static variables in non static block
		b=50;
		c=60;
		
		m=100;
		n=200;
		o=300;
	}
	void display1() {
		System.out.println("inside non static method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println("inside non static method accessing static variable");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	

	

	public static void main(String[] args) {
		System.out.println("Inside main method");//2.after block static method after block
		display();
		Example1 e= new Example1();
		e.display1();
		
		

	}

}
