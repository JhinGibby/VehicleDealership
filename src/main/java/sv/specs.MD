# SPECS

>You'll develop a basic console-based application for a vehicle dealership where clients can purchase cars and motorbikes. The program will display the total price and a list of purchased vehicles.
Requirements:
    Classes:
        Vehicle Class:
            Fields: String name, double price
            Constructor: Initialize name and price.
            Methods:
                getName(): Returns the name of the vehicle.
                getPrice(): Returns the price of the vehicle.

*       Car Class: Inherits from Vehicle.
*       Constructor: Initialize the name and price using the Vehicle class constructor.

 *      Motorbike Class: Inherits from Vehicle.
 *      Constructor: Initialize the name and price using the Vehicle class constructor.

 *      Array of Vehicles:
        Store a predefined list of available cars and motorbikes in arrays.
        
*           User Input:
            Use Scanner to allow the user to select and order vehicles.
            The user can choose between cars and motorbikes and then pick a vehicle by entering the corresponding number.
            The user should be able to continue adding vehicles to their order until they decide to quit.

 *       Loops:
            Implement a loop that keeps prompting the user to order more vehicles until they choose to quit.
            Within the loop, allow the user to view the list of available vehicles and add them to their order.

  *      Display:
            After the user finishes their order, display the following:
                List of Purchased Vehicles: Names and prices of all vehicles ordered.
                Total Price: The sum of all vehicle prices.