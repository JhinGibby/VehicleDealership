package sv;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
    HashMap<Vehicle, Integer> VehicleCatalogue = new HashMap<>();
    HashMap<String, Car> CarCatalogue = new HashMap<>();
    HashMap<String, Motorbike> MotorbikeCatalogue = new HashMap<>();

    public Catalogue() {
        // Adding cars to the catalogue using brand name as the key
        CarCatalogue.put("Nissan", new Car("370Z", 80000));
        CarCatalogue.put("Ferrari", new Car("LaFerrari", 450000));
        CarCatalogue.put("Lada", new Car("Niva", 40000));
        CarCatalogue.put("Aurus", new Car("Senat", 2500000));
        CarCatalogue.put("Lamborghini", new Car("Insect", 380000));

        // Adding motorbikes to the catalogue
        MotorbikeCatalogue.put("Kawasaki", new Motorbike("Ninja", 60000));
        MotorbikeCatalogue.put("BMW", new Motorbike("R 1250 RS", 50000));
        MotorbikeCatalogue.put("Ducati", new Motorbike("SuperSport 950", 49000));
        MotorbikeCatalogue.put("Royal Enfield", new Motorbike("Bullet 350", 25000));
        MotorbikeCatalogue.put("Harley Davidson", new Motorbike("Harley Davidson", 88000));
    }

    public void displayCars() {
        System.out.println("Car Catalogue:");
        int index = 1;
        for (String brand : CarCatalogue.keySet()) {
            Car car = CarCatalogue.get(brand);
            System.out.println(index + ". " + brand + " " + car.getName() + ", Price: £" + car.getPrice());
            index++;
        }
    }

    public void displayBikes() {
        System.out.println("Motorbike Catalogue:");
        int index = 1;
        for (String brand : MotorbikeCatalogue.keySet()) {
            Motorbike motorbike = MotorbikeCatalogue.get(brand);
            System.out.println(index + ". " + brand + " " + motorbike.getName() + ", Price: £" + motorbike.getPrice());
        index++;
        }
    }
}
