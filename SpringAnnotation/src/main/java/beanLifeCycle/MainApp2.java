package beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BeanDemo2 b2=c.getBean("b2",BeanDemo2.class);
        b2.display();
        c.close();

    }
}
