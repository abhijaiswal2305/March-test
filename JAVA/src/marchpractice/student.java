package marchpractice;

public class student {
	int age;
	int rollno;
	void Display1()
	{
		System.out.println("Welcome you all");
	}
	void Display2()
	{
		System.out.println("Automation is easy");
		
	}
	public static void main(String[] args) {
		student a= new student();
		a.Display1();
		a.Display2();
		a.age=16;
		a.rollno=19;
		System.out.println(a.age );
		System.out.println(a.rollno );
	}
	
}
