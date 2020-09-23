package com.example.navigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final MainFragmentDirections.ActionMainFragmentToSecondFragment action =
                MainFragmentDirections.actionMainFragmentToSecondFragment("Hello!!!!");

//        view.findViewById(R.id.button).setOnClickListener {
//            Navigation.findNavController(view).navigate(action);
//        };

        view.findViewById(R.id.button).setOnClickListener((view) -> {
            Navigation.findNavController(view).navigate(action);
        });
//아래로 변경
        view.findViewById(R.id.button).setOnClickListener((view1) -> {
            Navigation.findNavController(view1).navigate(action);
        });


    }
}