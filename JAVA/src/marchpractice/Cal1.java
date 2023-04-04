package marchpractice;

public class Cal1 

//
{
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
			Cal1 ab = new Cal1();
			int sumres=ab.sum(10, 2);
			int sumres1=ab.sum(sumres, 2);
			int subres=ab.sub(sumres1, 2);
			int mulres=ab.mul(subres, 2);
			ab.div(mulres, 2);
			
		}
}
