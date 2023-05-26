package cardi;


public class Nexon implements Car
{
    String carType;
    String EngineType;
    Diesel d;

    public void setCarType(String carType)
    {
        this.carType = carType;
    }

    @Override
    public void getCarType() {
        System.out.println("THIS IS SEDAN");
    }

    @Override
    public void getEngineType() {
        d.getEngineType();
    }
}
