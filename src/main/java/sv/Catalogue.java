package sv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Catalogue {
    HashMap<UUID, Vehicle> VehicleCatalogue = new HashMap<>();

    public Catalogue() {
        // Add vehicles to the catalogue
        VehicleCatalogue.put(UUID.randomUUID(), new Car("BMW M5", 52000));
        VehicleCatalogue.put(UUID.randomUUID(), new Car("Nissan 370Z", 28000));
        VehicleCatalogue.put(UUID.randomUUID(), new Car("Ferrari LaFerrari", 450000));
        VehicleCatalogue.put(UUID.randomUUID(), new Car("Lada Niva", 10000));
        VehicleCatalogue.put(UUID.randomUUID(), new Car("Aurus Senat", 2500000));
        VehicleCatalogue.put(UUID.randomUUID(), new Car("Lamborghini Insect", 380000));
        VehicleCatalogue.put(UUID.randomUUID(), new Motorbike("Kawasaki Ninja", 60000));
        VehicleCatalogue.put(UUID.randomUUID(), new Motorbike("BMW R 1250 RS", 50000));
        VehicleCatalogue.put(UUID.randomUUID(), new Motorbike("Ducati SuperSport 950", 49000));
        VehicleCatalogue.put(UUID.randomUUID(), new Motorbike("Royal Enfield Bullet 350", 25000));
        VehicleCatalogue.put(UUID.randomUUID(), new Motorbike("Harley Davidson", 88000));

    }

    // Display vehicles and return a list of UUIDs for the user to select
    public ArrayList<UUID> displayVehicles(int x) {
        ArrayList<UUID> displayedVehicleIds = new ArrayList<>();  // Store the UUIDs of the displayed vehicles

        if (x == 1) {  // Display cars
            System.out.println("Car Catalogue:");
            for (UUID id : VehicleCatalogue.keySet()) {
                Vehicle vehicle = VehicleCatalogue.get(id);
                if (vehicle instanceof Car) {  // Only display cars
                    System.out.println(displayedVehicleIds.size() + 1 + ". " + vehicle.getName() + " - Price: £" + vehicle.getPrice());
                    displayedVehicleIds.add(id);  // Add UUID to the list
                }
            }
        } else if (x == 2) {  // Display motorbikes
            System.out.println("Motorbike Catalogue:");
            for (UUID id : VehicleCatalogue.keySet()) {
                Vehicle vehicle = VehicleCatalogue.get(id);
                if (vehicle instanceof Motorbike) {  // Only display motorbikes
                    System.out.println(displayedVehicleIds.size() + 1 + ". " + vehicle.getName() + " - Price: £" + vehicle.getPrice());
                    displayedVehicleIds.add(id);  // Add UUID to the list
                }
            }
        }

        return displayedVehicleIds;  // Return the UUIDs for selection
    }

    // Get a specific vehicle by its UUID
    public Vehicle getVehicle(UUID id) {
        return VehicleCatalogue.get(id);
    }
}
