import java.sql.SQLOutput;

public class Car implements Vehicle{

    private double fuelQuantity;
    private double consuption;
    private static final double AID_CONDITIONING_ADDITIONAL_CONSUPTION = 0.9;

    public Car(double fuelQuantity, double consuption)
    {
        this.fuelQuantity = fuelQuantity;
        this.consuption = consuption + AID_CONDITIONING_ADDITIONAL_CONSUPTION;
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * this.consuption;
        if(fuelNeeded < this.fuelQuantity)
        {
            //can drive
            fuelQuantity = fuelQuantity - fuelNeeded;
            System.out.printf("Car travelled %.2f km%n", distance);
        }
        else
        {
            //can't drive
            System.out.println("Car need refueling");
        }
    }


    public double getFuelQuantity()
    {
        return this.fuelQuantity;
    }

    @Override
    public void refuel(double fuel){
        fuelQuantity = fuelQuantity + fuel;

    }
}
