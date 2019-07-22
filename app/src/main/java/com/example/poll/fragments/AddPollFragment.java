package com.example.poll.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.poll.R;

public class AddPollFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_poll, container, false);

        final EditText questionEditText = view.findViewById(R.id.input_question);
        final EditText answerOneEditText = view.findViewById(R.id.input_answer_one);
        final EditText answerTwoEditText = view.findViewById(R.id.input_answer_two);
        final EditText answerThreeEditText = view.findViewById(R.id.input_answer_three);
        ImageView save = view.findViewById(R.id.save_poll);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = questionEditText.getText().toString().trim();
                String answerOne = answerOneEditText.getText().toString().trim();
                String answerTwo = answerTwoEditText.getText().toString().trim();
                String answerThree = answerThreeEditText.getText().toString().trim();

                //TODO save in database
            }
        });

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ((AppCompatActivity) getActivity()).getSupportActionBar().show();
    }
}
