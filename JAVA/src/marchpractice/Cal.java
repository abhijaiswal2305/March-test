package marchpractice;

public class Cal {
	
	public int sum(int a,int b)
	{
    int c;
    c=a+b;
    System.out.println(c);
    return c;
	}
	
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println(z);
		return z;
	}
	public void mul(int p,int q)
	{
		int r;
		r=p*q;
		System.out.println(r);
	}
	public static void main(String[] args) {
		
		Cal ab= new Cal();
		int sumres=ab.sub(100,50);
		int subres=ab.sub(100, 90);
		ab.mul(sumres, subres);
		
		
		
	}
	}
	


