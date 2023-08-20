package main.java;

import main.java.activities.Activity;
import main.java.destinations.Destination;
import main.java.enums.PassengerType;
import main.java.packages.TravelPackage;
import main.java.passengers.Passenger;

public class TravelAgencySystem {
    public static void main(String[] args) {
        TravelPackage package1 = new TravelPackage("Package 1", 50);
        Destination dest1 = new Destination("Destination 1");
        Activity activity1 = new Activity("Activity 1", "Description 1", 100.0, 20, dest1);
        dest1.addActivity(activity1);
        package1.addDestination(dest1);

        // Sample usage of the system
        Passenger passenger1 = new Passenger("John", 1, 200.0, PassengerType.STANDARD);
        passenger1.signUpForActivity(activity1);
        package1.addPassenger(passenger1);

        // Print itinerary, passenger list, details, and available activities
        package1.printItinerary();
        package1.printPassengerList();
        package1.printPassengerDetails(passenger1);
        package1.printAvailableActivities();
    }
}
