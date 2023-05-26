package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Component
@Qualifier(value = "experience")
public class Noncommercial implements Institute{
    @Autowired
      Student s1;

    public Noncommercial(Student s1) {
        this.s1 = s1;
    }

    @Override
    public void getType() {
        System.out.println("This is non commercial");
    }

    @Override
    public void getStudents() {
       s1.getType();
    }
}
