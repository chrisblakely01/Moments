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
public class JournalEntry {

    private int journalEntryId;
    private int image;
    private String title;
    private String description;

    public static List<JournalEntry> getDummyJournalEntrys() {

        List<JournalEntry> journalEntries = new ArrayList<>();

        journalEntries.add(JournalEntry.builder()
                .journalEntryId(1)
                .title("Trip 1")
                .description(getDummyDescription()).image(R.drawable.hol1)
                .build());

        journalEntries.add(JournalEntry.builder()
                .journalEntryId(1)
                .title("Trip 2")
                .description(getDummyDescription()).image(R.drawable.hol2)
                .build());

        journalEntries.add(JournalEntry.builder()
                .journalEntryId(1)
                .title("Trip 3")
                .description(getDummyDescription()).image(R.drawable.hol3)
                .build());

        return journalEntries;
    }

    private static String getDummyDescription(){
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam bibendum justo tincidunt est mattis porttitor.";
    }

}
