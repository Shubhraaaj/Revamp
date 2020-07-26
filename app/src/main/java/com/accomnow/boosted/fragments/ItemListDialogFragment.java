package com.accomnow.boosted.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.accomnow.boosted.R;
import com.google.android.material.navigation.NavigationView;

public class ItemListDialogFragment extends BottomSheetDialogFragment {
    private NavigationView mBar;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_bottomsheet, container, false);
    }

    /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBar = getActivity().findViewById(R.id.navigation_view);
        *//*mBar.setNavigationItemSelectedListener(item -> {
            if (item.getItemId()==R.id.nav1)
                Toast.makeText(getContext(), "Clicked Routines", Toast.LENGTH_SHORT).show();
            if (item.getItemId()==R.id.nav2)
                Toast.makeText(getContext(), "Clicked Habits", Toast.LENGTH_SHORT).show();
            if (item.getItemId()==R.id.nav3)
                Toast.makeText(getContext(), "Clicked Focus-o-meter", Toast.LENGTH_SHORT).show();
            return true;
        });*//*
    }*/
}