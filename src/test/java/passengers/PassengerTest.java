package test.java.passengers;

import main.java.activities.Activity;
import main.java.destinations.Destination;
import main.java.enums.PassengerType;
import main.java.passengers.Passenger;

import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerTest {

    @Test
    public void testSignUpForActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Activity description", 100.0, 1, destination);
        Passenger passenger = new Passenger("John", 1, 200.0, PassengerType.STANDARD);

        passenger.signUpForActivity(activity);

        assertTrue(passenger.getSignedUpActivities().contains(activity));
        assertEquals(100.0, passenger.getBalance(), 0.01);
    }

    @Test
    public void testGoldPassengerSignUp() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Activity description", 100.0, 1, destination);
        Passenger passenger = new Passenger("Jane", 2, 200.0, PassengerType.GOLD);

        passenger.signUpForActivity(activity);

        assertTrue(passenger.getSignedUpActivities().contains(activity));
        assertEquals(190.0, passenger.getBalance(), 0.01);
    }
}