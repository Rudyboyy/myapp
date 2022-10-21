package com.example.myapplication.ui.workmates;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Workmates;

import java.util.ArrayList;

public class WorkmatesAdapter extends RecyclerView.Adapter<WorkmatesAdapter.ViewHolder> {

    private ArrayList<Workmates> mWorkmates;

    public WorkmatesAdapter(ArrayList<Workmates> workmates) {
        this.mWorkmates = workmates;
    }

    @NonNull
    @Override
    public WorkmatesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_workmates, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkmatesAdapter.ViewHolder holder, int position) {
        Workmates workmates = mWorkmates.get(position);
        holder.displayWorkmates(workmates);
    }

    @Override
    public int getItemCount() {
        return mWorkmates.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final ImageView avatar;
        public final TextView workmate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.avatar = itemView.findViewById(R.id.item_list_avatar);
            this.workmate = itemView.findViewById(R.id.workmate_text_view);
        }

        @SuppressLint("SetTextI18n")
        public void displayWorkmates(Workmates workmates) {
            avatar.setImageResource(workmates.getAvatar());
            if (workmates.isChoose()) {
                workmate.setText(workmates.getName() + " is eating " + workmates.getRestaurant().getFoodStyle() + " (" + workmates.getRestaurant().getName() +")");
            } else {
                workmate.setText(workmates.getName() + " hasn't decided yet");
            }
        }
    }
}
