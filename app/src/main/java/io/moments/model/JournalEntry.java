package io.moments.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.moments.R;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class JournalEntry {

    private int journalEntryId;
    private int image;
    private String title;
    private String description;
    private String location;
    private String weather;
    private LocalDateTime date;
    private String activity;

    public static List<JournalEntry> getDummyJournalEntrys() {

        List<JournalEntry> journalEntries = new ArrayList<>();

        journalEntries.add(JournalEntry.builder()
                .journalEntryId(1)
                .title("My awesome day at Toronto coast")
                .description(getDummyDescription()).image(R.drawable.hol1)
                .location("Nothern Toronto, Canada")
                //.weather("10C")
                //.activity("Walking")
                .build());

        journalEntries.add(JournalEntry.builder()
                .journalEntryId(1)
                .title("Stumbled upon an amazing castle!!")
                .location("Barcelona, Spain")
                .weather("24C")
                .activity("Exploring")
                .description(getDummyDescription()).image(R.drawable.hol2)
                .build());

        journalEntries.add(JournalEntry.builder()
                .journalEntryId(1)
                .title("Bali Beach is beautiful")
                .location("Bali, Indonesia")
                .weather("15C")
                .description(getDummyDescription()).image(R.drawable.hol3)
                .build());

        return journalEntries;
    }

    private static String getDummyDescription(){
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam bibendum justo tincidunt est mattis porttitor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam bibendum justo tincidunt est mattis porttitor. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam bibendum justo tincidunt est mattis porttitor.";
    }

}
