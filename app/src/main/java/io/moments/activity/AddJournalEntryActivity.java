package io.moments.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import io.moments.R;

public class AddJournalEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_journal_entry);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_save_journal_entry);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        view.getContext(),
                        "Saving Journal Entry! (TODO - actually save the journal entry)",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}
