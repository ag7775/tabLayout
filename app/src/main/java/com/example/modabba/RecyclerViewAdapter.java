package com.example.modabba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context context;
    private List<Modal> modals;

    public RecyclerViewAdapter(Context context, List<Modal> modals) {
        this.context = context;
        this.modals = modals;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.pager_fragment,null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.plan.setText(modals.get(position).getPlan());
        holder.price.setText(modals.get(position).getPrice());
        holder.skips.setText(modals.get(position).getSkips());
    }

    @Override
    public int getItemCount() {
        return modals.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView plan,price,skips;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            plan = itemView.findViewById(R.id.plan);
            price = itemView.findViewById(R.id.price);
            skips = itemView.findViewById(R.id.skips);
        }
    }
}
