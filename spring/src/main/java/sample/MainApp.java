package sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("select the course to get syllabus");
        System.out.println("\n1.Development\n2.Testing");
        int num=sc.nextInt();
        ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Course d1=null;
        if(num==1)
        {
          d1= c.getBean("course1", Course.class);
        } else if (num==2) {
            d1=c.getBean("course2", Course.class);
        }
        d1.getsyllabus();
    }
}
