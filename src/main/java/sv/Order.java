package sv;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    protected Catalogue catalogue;
    protected Scanner sc;

    double cost = 0;
    ArrayList<Vehicle> basket = new ArrayList<>();

    // empty constructor
    public Order() {
        this.catalogue = new Catalogue();
        this.sc = new Scanner(System.in);

    }

    // Getters:
    public void setCost(double cost) {
        this.cost = cost;
    }

    // Setters:
    public double getCost() {
        return cost;
    }

    public void addToBasket(Vehicle v) {
        basket.add(v);
    }

    public void getBasket() {
        if (basket.isEmpty()) {
            System.out.println("No items added in your basket");
        } else {
            System.out.println("Items in your basket:");
            for (Vehicle v : basket) {
                System.out.println(v.getName() + " - Price: £" + v.getPrice());
            }
        }
    }

    public double getTotalCost() {
        double total = 0;
        for (Vehicle v : basket) {
            total += v.getPrice();
        }
        return total;
    }

    public void initOrder() {

        int choice = 0;
        while (choice != 4) {
            System.out.println();
            System.out.println("Please select an option:");
            System.out.println("1. select to see our cars");
            System.out.println("2. select to see our motorbikes");
            System.out.println("3. select to see your basket");
            System.out.println("4. select to finish");
            System.out.println();
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    catalogue.displayCars();
                    System.out.println("Please select a car");
                    int carChoice = sc.nextInt();
                    ArrayList<String> carBrands = new ArrayList<>(catalogue.CarCatalogue.keySet());
                    if (carChoice > 0 && carChoice <= carBrands.size()) {
                        String selectedCarBrand = carBrands.get(carChoice -1);  // Get brand by index
                        addToBasket(catalogue.CarCatalogue.get(selectedCarBrand));  // Add car to basket
                    } else {
                        System.out.println("Invalid selection.");
                    }
                    break;
                case 2:
                    catalogue.displayBikes();
                    System.out.println("Please select a motorbike");
                    break;
                case 3:
                    getBasket();
                    break;
                case 4:
                    getBasket();
                    getTotalCost();
                    System.out.println("Thank you for shopping!");

                    break;
                default:
                    System.out.println("Please select a valid option!");

            }


        }
    }
}
