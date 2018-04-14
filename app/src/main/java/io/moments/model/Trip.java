package io.moments.model;

import java.util.ArrayList;
import java.util.List;

import io.moments.R;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Trip {

    private int tripId;
    private String title;
    private String description;
    private int image;

    //TODO replace with real service call
    public static List<Trip> getDummyTrips() {

        List<Trip> trips = new ArrayList<>();

        trips.add(Trip.builder()
                .tripId(1)
                .title("Trip 1")
                .description(getDummyDescription()).image(R.drawable.hol1)
                .build());

        trips.add(Trip.builder()
                .tripId(2)
                .title("Trip 2")
                .description(getDummyDescription()).image(R.drawable.hol2)
                .build());

        trips.add(Trip.builder()
                .tripId(3)
                .title("Trip 3")
                .description(getDummyDescription()).image(R.drawable.hol3)
                .build());

        return trips;
    }

    private static String getDummyDescription(){
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam bibendum justo tincidunt est mattis porttitor.";
    }
}


