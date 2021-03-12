package demo1;
import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
	String str="CUTTING";
	String str1=new String("AXE");
   Scanner s = new Scanner(System.in);
   System.out.println("enter the operation");
   int op = s.nextInt();
    
   switch(op)
   {
   case 1:
	   StringBuffer a=new StringBuffer(str.concat(str1));
	   System.out.println("split string is: "+a);
	   break;
	   
   case 2:
	   StringBuffer b=new StringBuffer(str.substring(3));
	   System.out.println("sub string is: "+b);
	   break;
	   
	   
   case 3:
	   StringBuffer c=new StringBuffer(str1.toLowerCase());
	   System.out.println("lowercase string is: "+c);
	   break;
	   

  case 4:
	   System.out.println("Error");
	   break;
   }
}
}
