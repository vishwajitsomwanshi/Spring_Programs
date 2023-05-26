package beanLifeCycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("b2")
public class BeanDemo2
{
    @PostConstruct
    void startUp(){
        System.out.println("START UP CODE");
    }
    void display(){
        System.out.println("DISPLAY INFO");
    }
    @PreDestroy
    void cleanUp(){
        System.out.println("CLEAN UP CODE");
    }
}
