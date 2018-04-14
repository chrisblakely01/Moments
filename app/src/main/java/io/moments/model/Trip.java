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

    private int TripId;
    private String Title;
    private String Description;
    private int image;

    //TODO replace with real service call
    public static List<Trip> getDummyTrips() {

        List<Trip> trips = new ArrayList<>();

        trips.add(Trip.builder()
                .TripId(1)
                .Title("Trip 1")
                .Description(getDummyDescription()).image(R.drawable.hol1)
                .build());

        trips.add(Trip.builder()
                .TripId(2)
                .Title("Trip 2")
                .Description(getDummyDescription()).image(R.drawable.hol2)
                .build());

        trips.add(Trip.builder()
                .TripId(3)
                .Title("Trip 3")
                .Description(getDummyDescription()).image(R.drawable.hol3)
                .build());

        return trips;
    }

    private static String getDummyDescription(){
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam bibendum justo tincidunt est mattis porttitor.";
    }
}


