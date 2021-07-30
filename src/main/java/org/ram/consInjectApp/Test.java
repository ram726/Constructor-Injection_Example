package org.ram.consInjectApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ct= new ClassPathXmlApplicationContext("spring.xml");
	ICar bm= (ICar) ct.getBean("bm");
	bm.drive();
	
	ICar ad= (ICar) ct.getBean("ad");
	ad.drive();
}
}
