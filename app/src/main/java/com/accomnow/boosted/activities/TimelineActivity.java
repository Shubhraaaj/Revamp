package com.accomnow.boosted.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.accomnow.boosted.R;
import com.accomnow.boosted.fragments.ItemListDialogFragment;
import com.google.android.material.bottomappbar.BottomAppBar;

public class TimelineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);
        BottomAppBar mBar = findViewById(R.id.bottom_app_bar);
        setSupportActionBar(mBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.bottomappbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        if (item.getItemId()==android.R.id.home){
            Fragment btmdrwe = new ItemListDialogFragment();
            getSupportFragmentManager().beginTransaction().add(btmdrwe, "SP").commit();
        }
        return true;
    }
}