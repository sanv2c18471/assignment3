package demo1;

public class Stringbuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("sankari");
				sb.append("builder");
				sb.insert(2,"test");
				sb.reverse();
		System.out.println(sb);
	}
	}
