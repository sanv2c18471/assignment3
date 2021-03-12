package demo1;

public class Nestedclass {
	public static void main(String[] args) {
		Nestedclass.Inner s=new Nestedclass.Inner();
		s.msg();
	}
static int sum=50;
static class Inner{
	void msg() {
		System.out.println("sum is:"+sum);
	}
}
}
	