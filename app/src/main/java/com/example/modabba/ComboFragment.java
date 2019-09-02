package com.example.modabba;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ComboFragment extends Fragment {

    private RecyclerView recyclerView;
    private Context context;
    private List<Modal> data;

    public ComboFragment(Context context) {
        this.context = context;
    }
    public ComboFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.pager_layout,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        data = new ArrayList<>();
        data.add(new Modal("30","1500","7"));
        data.add(new Modal("14","840","3"));
        data.add(new Modal("3","210","1"));



        recyclerView  = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(context,data);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
