package cardi;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Petrol implements Engine{

    String EngineType;
    @Override
    public void getEngineType() {
        System.out.println("PETROL ENGINE");
    }
}
