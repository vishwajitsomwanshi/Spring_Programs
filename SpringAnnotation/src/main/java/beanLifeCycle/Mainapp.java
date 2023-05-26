package beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BeanDemo1 b1=c.getBean("b1",BeanDemo1.class);
        b1.test();

        BeanDemo1 b2=c.getBean("b1",BeanDemo1.class);
        b2.test();


        System.out.println(b1);
        System.out.println(b2);
    }
}
