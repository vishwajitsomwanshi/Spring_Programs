package cardi;


public class Harrier implements Car{
    String CarType;
    String EngineType;
    Petrol p;
    @Override
    public void getCarType() {
        System.out.println("THIS IS SUV CSR");
    }

    @Override
    public void getEngineType() {
        p.getEngineType();
    }
}
