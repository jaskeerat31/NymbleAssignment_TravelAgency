package test.java.activities;

import org.junit.Test;

import main.java.activities.Activity;
import main.java.destinations.Destination;

import static org.junit.Assert.assertEquals;

public class ActivityTest {

    @Test
    public void testActivityCreation() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Activity description", 100.0, 10, destination);

        assertEquals("Test Activity", activity.getName());
        assertEquals("Activity description", activity.getDescription());
        assertEquals(100.0, activity.getCost(), 0.01);
        assertEquals(10, activity.getCapacity());
        assertEquals(destination, activity.getDestination());
    }
}
