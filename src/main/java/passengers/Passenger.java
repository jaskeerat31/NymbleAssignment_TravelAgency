package main.java.passengers;

import java.util.ArrayList;
import java.util.List;

import main.java.activities.Activity;
import main.java.enums.PassengerType;

public class Passenger {
    private String name;
    private int passengerNumber;
    private double balance;
    private PassengerType type;
    private List<Activity> signedUpActivities;

    /**
     * Constructor for creating a passenger.
     *
     * @param name            The name of the passenger.
     * @param passengerNumber The passenger number.
     * @param balance         The balance of the passenger.
     * @param type            The type of passenger (standard, gold, premium).
     */
    public Passenger(String name, int passengerNumber, double balance, PassengerType type) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.balance = balance;
        this.type = type;
        this.signedUpActivities = new ArrayList<>();
    }

    /**
     * Signs up the passenger for an activity.
     *
     * @param activity The activity to sign up for.
     */
    public void signUpForActivity(Activity activity) {
        if (activity.getCapacity() > 0) {
            if (type == PassengerType.STANDARD) {
                if (balance >= activity.getCost()) {
                    balance -= activity.getCost();
                    signedUpActivities.add(activity);
                    activity.getDestination().getActivities().remove(activity);
                    activity.getDestination().getActivities().add(new Activity(
                            activity.getName(), activity.getDescription(),
                            activity.getCost(), activity.getCapacity() - 1, activity.getDestination()));
                }
            } else if (type == PassengerType.GOLD) {
                double discountedCost = activity.getCost() * 0.9;
                if (balance >= discountedCost) {
                    balance -= discountedCost;
                    signedUpActivities.add(activity);
                    activity.getDestination().getActivities().remove(activity);
                    activity.getDestination().getActivities().add(new Activity(
                            activity.getName(), activity.getDescription(),
                            activity.getCost(), activity.getCapacity() - 1, activity.getDestination()));
                }
            } else if (type == PassengerType.PREMIUM) {
                signedUpActivities.add(activity);
                activity.getDestination().getActivities().remove(activity);
                activity.getDestination().getActivities().add(new Activity(
                        activity.getName(), activity.getDescription(),
                        activity.getCost(), activity.getCapacity() - 1, activity.getDestination()));
            }
        }
    }

    // Other methods and getters
    public String getName() {
        return name;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Activity> getSignedUpActivities() {
        return signedUpActivities;
    }
}
