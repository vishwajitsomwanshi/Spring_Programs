package sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Institute i1=c.getBean("commercial",Institute.class);
        i1.getStudents();
        i1.getType();

        Institute i2=c.getBean("noncommercial",Institute.class);
        i2.getType();
        i2.getStudents();
    }
}
