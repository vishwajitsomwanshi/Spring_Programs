package cardi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
       Car c1=c.getBean("car1",Car.class);
        c1.getCarType();
       c1.getEngineType();

       Car c2=c.getBean("car2", Car.class);
       c2.getEngineType();
       c2.getCarType();
    }

}
