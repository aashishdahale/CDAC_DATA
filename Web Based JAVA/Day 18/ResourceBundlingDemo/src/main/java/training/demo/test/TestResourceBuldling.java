package training.demo.test;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestResourceBuldling {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Mybeans.xml");
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Marathi");
		System.out.println("2.English UK");
		System.out.println("2.English US");
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		String msg=null;
		String gmsg=null;
		switch(choice) {
		case 1:
			Locale l=new Locale("en_IN");
			msg=ctx.getMessage("msg.welcome", null, l);
			gmsg=ctx.getMessage("msg.greet", null, l);
			break;
		case 2:
			msg=ctx.getMessage("msg.welcome", null, Locale.UK);
			gmsg=ctx.getMessage("msg.greet", null, Locale.UK);
			break;
		case 3:
			msg=ctx.getMessage("msg.welcome", null, Locale.US);
			gmsg=ctx.getMessage("msg.greet", null, Locale.US);
			break;
		
		}
		
		System.out.println(msg);
		System.out.println(gmsg);
		
	}

}
