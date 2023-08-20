package test.java.packages;

import main.java.destinations.Destination;
import main.java.enums.PassengerType;
import main.java.packages.TravelPackage;
import main.java.passengers.Passenger;
import org.junit.Test;

import static org.junit.Assert.*;

public class TravelPackageTest {

    @Test
    public void testAddDestination() {
        TravelPackage travelPackage = new TravelPackage("Test Package", 20);
        Destination destination = new Destination("Test Destination");

        travelPackage.addDestination(destination);

        assertTrue(travelPackage.getDestinations().contains(destination));
    }

    @Test
    public void testAddPassenger() {
        TravelPackage travelPackage = new TravelPackage("Test Package", 1);
        Passenger passenger = new Passenger("John", 1, 200.0, PassengerType.STANDARD);

        travelPackage.addPassenger(passenger);

        assertTrue(travelPackage.getPassengers().contains(passenger));
    }
}
