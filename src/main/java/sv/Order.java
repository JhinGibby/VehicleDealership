package sv;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    double cost = 0;
    ArrayList<Vehicle> basket = new ArrayList<>();
    // empty constructor
    public Order() {

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
        System.out.println("Items in your basket:");
        for (Vehicle v : basket) {
            System.out.println(v);
        }
    }
}
