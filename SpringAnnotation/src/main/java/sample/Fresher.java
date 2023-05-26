package sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Fresher implements Student{
    @Override
    public void getType() {
        System.out.println("Student is fresher");
    }
}
