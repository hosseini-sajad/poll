package com.example.poll.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.poll.R;
import com.example.poll.model.User;

import java.util.List;

public class SearchFollowAdapter extends RecyclerView.Adapter<SearchFollowAdapter.FollowHolder>{

    private List<User> users;

    public SearchFollowAdapter(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public FollowHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.follow_list_item, viewGroup, false);

        return new FollowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FollowHolder holder, int position) {
        User user = users.get(position);
        holder.userName.setText(user.getUserName());
        holder.name.setText(user.getName());
        //TODO SET for image
        //
        //
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class FollowHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView image;
        public TextView userName;
        public TextView name;

        public FollowHolder(View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image_follow);
            userName = itemView.findViewById(R.id.username_follow);
            name = itemView.findViewById(R.id.name_follow);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
        }
    }
}
