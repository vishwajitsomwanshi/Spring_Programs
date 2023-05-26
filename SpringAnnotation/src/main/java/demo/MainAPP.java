package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPP
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Watch w1=c.getBean("AnalogWatch", Watch.class);
        w1.getType();

        Watch w2=c.getBean("SmartWatch", Watch.class);
        w2.getType();
    }
}
