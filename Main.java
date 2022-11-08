package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	
	Tom t=(Tom) context.getBean("tom");
	System.out.println(t.getAge());
	System.out.println(t.getHeight());
	System.out.println(t.getname());
	System.out.println(t.getSalary());
	System.out.println(t.getVillage());
	System.out.println("++++++++++++++++++++++");
	Tom t2=(Tom) context.getBean("tomy");
	System.out.println(t2.getAge());
	System.out.println(t2.getHeight());
	System.out.println(t2.getname());
	System.out.println(t2.getSalary());
	System.out.println(t2.getVillage());

}
}
