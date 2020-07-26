package com.accomnow.boosted;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.accomnow.boosted.adapters.ActivityAdapter;
import com.accomnow.boosted.interfaces.OnChecked;
import com.accomnow.boosted.models.Activity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnChecked {
    private RecyclerView mRecyler;
    private ActivityAdapter mAdapter;
    private List<Activity> mActivities = new ArrayList<>();
    private TextView mScore, mRating;
    private float score=0.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyler = findViewById(R.id.task_recycler);
        mAdapter = new ActivityAdapter(mActivities, MainActivity.this, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyler.setLayoutManager(mLayoutManager);
        mRecyler.addItemDecoration(new DividerItemDecoration(mRecyler.getContext(), DividerItemDecoration.VERTICAL));
        mRecyler.setItemAnimator(new DefaultItemAnimator());
        mRecyler.setAdapter(mAdapter);
        prepareData();
        mScore = findViewById(R.id.main_score);
        mRating = findViewById(R.id.main_rating);
    }

    private void prepareData() {
        Activity activity = new Activity("Brushing", "04:55AM", false, 1);
        mActivities.add(activity);
        activity = new Activity("Meditation, Gita","05:10AM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Workout","05:45AM",false, 1);
        mActivities.add(activity);
        activity = new Activity("YLearn","06:30AM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Youtube","07:00AM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Breakfast & Bath","08:30AM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Stocks","09:30AM",false, 1);
        mActivities.add(activity);
        activity = new Activity("ReactJS","10:30AM",false, 1);
        mActivities.add(activity);
        activity = new Activity("AWS","12:30PM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Lunch","01:30PM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Accomnow","03:00PM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Relax & Social","06:00PM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Stocks/Youtube/Blog","07:00PM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Dinner/Relax","08:00PM",false, 1);
        mActivities.add(activity);
        activity = new Activity("Novel Reading","10:00PM",false, 1);
        mActivities.add(activity);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onChecked(int index, boolean value) {
        mActivities.get(index).setTask_status(value);
        if (value)
            score+=1;
        else
            score-=1;
        mScore.setText("SCORE:" + String.valueOf(score));
        mRating.setText("Rating:" + String.valueOf(score/mActivities.size()));
        mAdapter.notifyDataSetChanged();
    }
}
