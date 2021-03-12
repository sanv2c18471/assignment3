package demo1;

public class Enum {
public enum Colors { RED, BLUE, YELLOW, PINK}
private static final Enum RED = null;
public static void main(String[] args) {
	for(Colors c: Colors.values()) {
		System.out.println(c);
	}
		Enum c=Enum.RED;
		{
			System.out.println(c);

		}
		
	}
	//System.out.println("value of Blue:"+Colors.valueOf("BLUE"));
	//System.out.println("index of Pink:"+Colors.valueOf("YELLOW").ordinal());
	}

