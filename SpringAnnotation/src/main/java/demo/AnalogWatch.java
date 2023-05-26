package demo;

import org.springframework.stereotype.Component;

@Component("AnalogWatch")
public class AnalogWatch implements Watch{
    @Override
    public void getType() {
        System.out.println("TYPE IS ANALOG");
    }
}
