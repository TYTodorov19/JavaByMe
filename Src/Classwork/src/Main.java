import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        Vehicle car = null;
        Vehicle truck = null;
        // Car 15 0.3
        String[] firstTokens = firstInput.split("\\s+");
        if (firstTokens[0].equals("Car")) {
            car = new Car(Double.parseDouble(firstTokens[1]),
                    Double.parseDouble(firstTokens[2]));
        }
        else if (firstTokens[0].equals("Truck")) {
            truck = new Truck(Double.parseDouble(firstTokens[1]),
                    Double.parseDouble((firstTokens[2]))) {
            };
        }
        else {
            System.out.println("Invalid input");
        }

        //Truck 100 .09
        String[] secondTokens = scanner.nextLine().split("\\s+");
        if (secondTokens[0].equals("Car")) {
            car = new Vehicle(Double.parseDouble(secondTokens[1]),
                    Double.parseDouble(secondTokens[2])) {
            };
        }
        else if (secondTokens[0].equals("Truck")) {
            truck = new Vehicle(Double.parseDouble(secondTokens[1]),
                    Double.parseDouble((secondTokens[2]))) {
            };
        }
        else {
            System.out.println("Invalid input");
        }

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++)
        {
            String command = scanner.nextLine();
            //Drive Car 9
            String[] tokens = command.split("\\s+");
            String verb = tokens[0];
            String vehicle = tokens[1];

            if (verb.equals("Drive"))
            {
                if (vehicle.equals("Car"))
                {
                    car.drive(Double.parseDouble(tokens[2]));
                } else if (vehicle.equals("Truck")) {

                }
                else {
                    System.out.println("invalid input");
                }
            }
            else if (verb.equals("Refuel")) {
                // refuel
            }
            else {
                System.out.println("invalid input");
            }
        }
        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
    }

}