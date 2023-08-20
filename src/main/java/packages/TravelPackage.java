package main.java.packages;

import java.util.ArrayList;
import java.util.List;

import main.java.activities.Activity;
import main.java.destinations.Destination;
import main.java.passengers.Passenger;

public class TravelPackage {
    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    /**
     * Constructor for creating a travel package.
     *
     * @param name             The name of the travel package.
     * @param passengerCapacity The passenger capacity of the travel package.
     */
    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    /**
     * Adds a destination to the list of destinations in the travel package.
     *
     * @param destination The destination to be added.
     */
    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    /**
     * Adds a passenger to the travel package.
     *
     * @param passenger The passenger to be added.
     */
    public void addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
        }
    }

    /**
     * Prints the itinerary of the travel package.
     */
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() +
                        ", Cost: " + activity.getCost() +
                        ", Capacity: " + activity.getCapacity() +
                        ", Description: " + activity.getDescription());
            }
        }
    }

    /**
     * Prints the list of passengers in the travel package.
     */
    public void printPassengerList() {
        System.out.println("Travel Package: " + name +
                ", Passenger Capacity: " + passengerCapacity +
                ", Number of Passengers: " + passengers.size());
        for (Passenger passenger : passengers) {
            System.out.println("Passenger: " + passenger.getName() +
                    ", Number: " + passenger.getPassengerNumber());
        }
    }

    // Other methods for printing details, available activities, etc.
    public void printPassengerDetails(Passenger passenger) {
        System.out.println("Passenger Details: ");
        System.out.println("Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());
        System.out.println("Balance: " + passenger.getBalance());
        System.out.println("Activities Signed Up For:");
        for (Activity activity : passenger.getSignedUpActivities()) {
            System.out.println("Activity: " + activity.getName() +
                    ", Destination: " + activity.getDestination().getName() +
                    ", Price Paid: " + activity.getCost());
        }
    }

    public void printAvailableActivities() {
        System.out.println("Available Activities: ");
        for (Destination destination : destinations) {
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName() +
                        ", Destination: " + activity.getDestination().getName() +
                        ", Spaces Available: " + activity.getCapacity());
            }
        }
    }

    public List<Destination> getDestinations() {
        return destinations;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}

