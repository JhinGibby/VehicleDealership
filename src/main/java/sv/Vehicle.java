package sv;

public class Vehicle{
    public String name;
    public double price;
// Getters
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

// Setters
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
@Override // GPT suggested
    public String toString() {
        return "Model: " + name + ", Price: £" + price;
    }
// constructor
    public Vehicle(String name, double price){
        this.name = name;
        this.price = price;
    }
}
