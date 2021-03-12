package demo1;
import java.math.BigDecimal;

public class Bigdecimal {
	
public static void main(String[] args) {
	
	BigDecimal v1,v2,maxval;
	
	v1=new BigDecimal("53723456789909246789");
	v2=new BigDecimal("5351234690009552561");
	
	maxval = v1.max(v2);
	
	System.out.println("max value is:" +maxval);
}
}
