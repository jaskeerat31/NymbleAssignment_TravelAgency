package main.java.destinations;
import main.java.activities.Activity;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String name;
    private List<Activity> activities;

    /**
     * Constructor for creating a destination.
     *
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Adds an activity to the list of activities available at this destination.
     *
     * @param activity The activity to be added.
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    // Other methods and getters
    public String getName() {
        return name;
    }

    public List<Activity> getActivities() {
        return activities;
    }
}
