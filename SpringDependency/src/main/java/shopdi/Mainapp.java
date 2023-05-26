package shopdi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Shop s1=c.getBean("shop1",Shop.class);
        s1.getShopType();
        s1.getProducts();

        System.out.println("==================================");

        Shop s2=c.getBean("shop2", Shop.class);
        s2.getShopType();
        s2.getProducts();
    }
}
