package demo;

import org.springframework.stereotype.Component;

@Component("SmartWatch")
public class SmartWatch implements Watch
{

    @Override
    public void getType() {
        System.out.println("THIS IS SMART WATCH");
    }
}
