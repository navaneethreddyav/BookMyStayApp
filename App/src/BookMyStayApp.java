/**
 * Hotel Booking App - Use Case 2
 * Shows different room types and availability
 *
 * @author navaneeth
 * @version 2.0
 */

// Abstract class
abstract class Room {
    String type;
    int beds;
    double price;

    Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    void displayRoom() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: " + price);
    }
}

// Single Room
class SingleRoom extends Room {
    SingleRoom() {
        super("Single Room", 1, 1000);
    }
}

// Double Room
class DoubleRoom extends Room {
    DoubleRoom() {
        super("Double Room", 2, 2000);
    }
}

// Suite Room
class SuiteRoom extends Room {
    SuiteRoom() {
        super("Suite Room", 3, 5000);
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Book My Stay App");
        System.out.println("Version: 2.0");

        Room r1 = new SingleRoom();
        Room r2 = new DoubleRoom();
        Room r3 = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        r1.displayRoom();
        System.out.println("Available: " + singleAvailable);
        System.out.println();

        r2.displayRoom();
        System.out.println("Available: " + doubleAvailable);
        System.out.println();

        r3.displayRoom();
        System.out.println("Available: " + suiteAvailable);
    }
}