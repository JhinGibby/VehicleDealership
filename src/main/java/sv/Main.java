package sv;

public class Main {
    public static void main(String[] args) {

        Catalogue catalogue = new Catalogue();
        catalogue.displayCars();
        catalogue.displayBikes();

        Order order = new Order();
        order.getBasket();


    }
}