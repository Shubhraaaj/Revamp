package com.accomnow.boosted.adapters;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.accomnow.boosted.R;
import com.accomnow.boosted.interfaces.OnChecked;
import com.accomnow.boosted.models.Activity;

import java.util.List;

public class ActivityAdapter extends RecyclerView.Adapter<ActivityAdapter.ActivityHolder> {
    private List<Activity> mActivityList;
    private Context context;
    private OnChecked mCheckedCallback;
    public ActivityAdapter(List<Activity> activityList, Context context, OnChecked listener) {
        this.mActivityList = activityList;
        this.context = context;
        this.mCheckedCallback = listener;
    }

    @NonNull
    @Override
    public ActivityAdapter.ActivityHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.task_li, parent, false);

        return new ActivityHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ActivityAdapter.ActivityHolder holder, final int position) {
        holder.time.setText(mActivityList.get(position).getTask_time());
        holder.task.setText(mActivityList.get(position).getTask_name());
        holder.img.setImageResource(R.drawable.ic_task_aws);
        holder.completed.setChecked(mActivityList.get(position).isTask_status());
        /*holder.completed.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //set your object's last status
                mCheckedCallback.onChecked(position, holder.completed.isChecked());
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return mActivityList.size();
    }

    public class ActivityHolder extends RecyclerView.ViewHolder {
        public TextView time, task;
        public CheckBox completed;
        public ImageView img;

        public ActivityHolder(@NonNull View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.task_li_activity_time);
            task = itemView.findViewById(R.id.task_li_activity_task);
            completed = itemView.findViewById(R.id.task_li_activity_check);
            img = itemView.findViewById(R.id.task_li_activity_img);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (completed.isChecked())
                        completed.setChecked(false);
                    else
                        completed.setChecked(true);
                    mCheckedCallback.onChecked(getAdapterPosition(), completed.isChecked());
                }
            });
        }
    }
}
