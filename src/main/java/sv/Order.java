package sv;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Order {
    protected Scanner sc;
    protected Catalogue catalogue;
    double cost = 0;
    ArrayList<Vehicle> basket = new ArrayList<>();

    // Constructor
    public Order() {
        this.catalogue = new Catalogue();  // Initialize the vehicle catalogue
        this.sc = new Scanner(System.in);  // Initialize the scanner for user input
    }

    // Main order flow
    public void initOrder() {
        int choice = 0;
        while (choice != 4) {
            System.out.println();
            System.out.println("Please select an option:");
            System.out.println("1. View our cars");
            System.out.println("2. View our motorbikes");
            System.out.println("3. View your basket");
            System.out.println("4. Finish and calculate total cost");
            System.out.println();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    handleVehicleSelection(1);  // Select a car
                    break;
                case 2:
                    handleVehicleSelection(2);  // Select a motorbike
                    break;
                case 3:
                    getBasket();  // Display basket
                    break;
                case 4:
                    getBasket();
                    double totalCost = getTotalCost();  // Calculate total cost
                    System.out.println("Total cost: £" + totalCost);
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        }
    }

    // Handle the selection of vehicles (cars or motorbikes)
    private void handleVehicleSelection(int vehicleType) {
        ArrayList<UUID> vehicleIds = catalogue.displayVehicles(vehicleType);  // Get the UUIDs of the displayed vehicles
        System.out.println("Please select a vehicle:");
        int vehicleChoice = sc.nextInt();

        if (vehicleChoice > 0 && vehicleChoice <= vehicleIds.size()) {
            UUID selectedVehicleId = vehicleIds.get(vehicleChoice - 1);  // Get the corresponding vehicle UUID
            Vehicle selectedVehicle = catalogue.getVehicle(selectedVehicleId);  // Get the Vehicle object
            addToBasket(selectedVehicle);  // Add vehicle to the basket
            System.out.println(selectedVehicle.getName() + " has been added to your basket.");
        } else {
            System.out.println("Invalid selection.");
        }
    }

    // Add the selected vehicle to the basket
    public void addToBasket(Vehicle v) {
        if (v != null) {
            basket.add(v);
        } else {
            System.out.println("Invalid vehicle, cannot add to the basket.");
        }
    }

    // Display the basket contents
    public void getBasket() {
        if (basket.isEmpty()) {
            System.out.println("No items added to your basket.");
        } else {
            System.out.println("Items in your basket:");
            for (Vehicle v : basket) {
                System.out.println(v.getName() + " - Price: £" + v.getPrice());
            }
        }
    }

    // Calculate the total cost of items in the basket
    public double getTotalCost() {
        double total = 0;
        for (Vehicle v : basket) {
            total += v.getPrice();
        }
        return total;
    }
}
