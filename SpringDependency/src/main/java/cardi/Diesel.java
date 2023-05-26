package cardi;

public class Diesel implements Engine
{
    String  EngineType;
    @Override
    public void getEngineType() {
        System.out.println("DIESEL ENGINE");
    }
}
