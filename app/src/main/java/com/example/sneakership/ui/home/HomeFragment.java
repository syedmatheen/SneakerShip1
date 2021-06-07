package com.example.sneakership.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.sneakership.DetailsScreen;
import com.example.sneakership.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    GridLayout gridLayout;
    View card1;
    ImageView plus, plus1, plus2, plus3, shoe1, shoe2, shoe3, shoe4;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });

        card1 = rootView.findViewById(R.id.card1);
        plus = rootView.findViewById(R.id.plus);
        plus1 = rootView.findViewById(R.id.plus1);
        plus2 = rootView.findViewById(R.id.plus2);
        plus3 = rootView.findViewById(R.id.plus3);
        shoe1 = rootView.findViewById(R.id.shoe1);
        shoe2 = rootView.findViewById(R.id.shoe2);
        shoe3 = rootView.findViewById(R.id.shoe3);
        shoe4 = rootView.findViewById(R.id.shoe4);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsScreen.class);
                startActivity(intent);
            }
        });
        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsScreen.class);
                startActivity(intent);
            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsScreen.class);
                startActivity(intent);
            }
        });
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsScreen.class);
                startActivity(intent);
            }
        });
        shoe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsScreen.class);
                startActivity(intent);
            }
        });
        shoe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsScreen.class);
                startActivity(intent);
            }
        });
        shoe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsScreen.class);
                startActivity(intent);
            }
        });
        shoe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), DetailsScreen.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

}