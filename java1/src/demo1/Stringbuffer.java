package demo1;

public class Stringbuffer {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("Hellohi");
	System.out.println(sb);
    sb.append("3.2");
	System.out.println(sb);
    sb.insert(2,"hai");
	System.out.println(sb);
    sb.reverse();
	System.out.println(sb);
    sb.deleteCharAt(2);
	System.out.println(sb);
	sb.replace(0, 8, "sankari");
	System.out.println(sb);

}
}
