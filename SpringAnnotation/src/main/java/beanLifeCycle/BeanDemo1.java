package beanLifeCycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("b1")
@Scope("prototype")
public class BeanDemo1
{
    void test(){
        System.out.println("TEST METHOD");
    }
}
