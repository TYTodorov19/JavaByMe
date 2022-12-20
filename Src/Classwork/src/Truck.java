public class Truck {
    private double fuelQuantity;
    private double consumption;

    private static final double AID_CONDITIONING_ADDITIONAL_CONSUPTION = 1.6;


    public Truck(double fuelQuantity, double consumption)
    {
        this.fuelQuantity = fuelQuantity;
        this.consumption = consumption + AID_CONDITIONING_ADDITIONAL_CONSUPTION;
    }

    @Override
    public void drive(double distance)
    {
        double fuelNeeded = distance * this.consumption;
        if(fuelNeeded < fuelQuantity)
        {
            fuelQuantity -= fuelNeeded;
            System.out.printf("Truck travelled %.0f km%n", distance);
        }
        else {
            System.out.println("Truck needs refueling");
        }
    }


    @Override
    public void refuel(double fuel)
    {
        fuelQuantity += fuel * 0.95;
    }




}
