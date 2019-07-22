package com.example.poll.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.poll.R;
import com.example.poll.model.Poll;

import java.util.List;

public class RecyclerPollAdapter extends RecyclerView.Adapter<RecyclerPollAdapter.ListViewHolder>{

    private List<Poll> mPolls;
    private Context mContext;

    public RecyclerPollAdapter(List<Poll> mPolls, Context mContext) {
        this.mPolls = mPolls;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.poll_list_item, viewGroup, false);

        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Poll poll = mPolls.get(position);
        holder.question.setText(poll.getQuestion());
        holder.date.setText(poll.getDate());
        holder.voteNumber.setText(poll.getVoteNumber());
    }

    @Override
    public int getItemCount() {
        return mPolls.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView question;
        public TextView date;
        public TextView voteNumber;

        public ListViewHolder(View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.question_text);
            date = itemView.findViewById(R.id.date_text);
            voteNumber = itemView.findViewById(R.id.number_of_vote);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
        }
    }
}
