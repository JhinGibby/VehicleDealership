package sv;

public class Vehicle{
    public enum VehicleType{CAR, MOTORBIKE}
    protected String name;
    protected double price;
    protected VehicleType type;

    // Getters
    public String getName(){return name;    }
    public double getPrice(){return price;    }
    public VehicleType getType(){return type;    }



    // Setters
    public void setName(String name){this.name = name;    }
    public void setPrice(double price){this.price = price;    }
    public void setType(VehicleType type){this.type = type;    }


    @Override // GPT suggested
    public String toString() {
        return "Model: " + name + ", Price: £" + price;
    }
// constructor
    public Vehicle(String name, double price){
        this.name = name;
        this.price = price;
        this.type = type;
    }
}
