package marchpractice;

public class Cal2 {
	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("sum res"+c);
		return c;
		
	}
	public int sub(int d, int e) {
		int f;
		f=d-e;
		
		System.out.println("sub res"+f);
		return f;
}
	public int mul(int g, int h)
	{
		int i;
		i=g*h;
		System.out.println("mul res"+i);
		return i;
	}
	public void div(int j, int k)
	{
		int l;
		l=j/k;
		System.out.println("div res"+l);
		
	}
	
	public static void main(String[] args) {
		Cal2 ab=new Cal2();
		int mul=ab.mul(10, 2);
		int sub=ab.sub(mul, 2);
		int sum=ab.sum(sub, 2);
		int sub1=ab.sub(sum, 2);
		ab.div(sub1, 2);
		
	}

}
