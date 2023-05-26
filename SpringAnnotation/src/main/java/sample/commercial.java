package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class commercial implements Institute{
    @Autowired
    Student s;

    public commercial(Student s) {
        this.s = s;
    }

    @Override
    public void getType() {
        System.out.println("This is commercial");
    }

    @Override
    public void getStudents() {
      s.getType();
    }
}
