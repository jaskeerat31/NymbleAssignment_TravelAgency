package test.java.destinations;

import org.junit.Test;

import main.java.activities.Activity;
import main.java.destinations.Destination;

import static org.junit.Assert.assertEquals;

public class DestinationTest {

    @Test
    public void testAddActivity() {
        Destination destination = new Destination("Test Destination");
        Activity activity = new Activity("Test Activity", "Activity description", 100.0, 10, destination);

        destination.addActivity(activity);

        assertEquals(1, destination.getActivities().size());
        assertEquals(activity, destination.getActivities().get(0));
    }
}
