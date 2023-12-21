package com.example.androidbasics;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class PasswordFragment extends Fragment {

    private static final String ARG_USERNAME = "username";

    private String username;
    private PasswordFragment.callBackListener passwordListener;

    public interface callBackListener {
        void onPasswordSuccess(String username);
    }

    public PasswordFragment() {
        // Required empty public constructor
    }

    public static PasswordFragment newInstance(String username) {
        PasswordFragment fragment = new PasswordFragment();
        Bundle args = new Bundle();
        args.putString(ARG_USERNAME, username);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            username = getArguments().getString(ARG_USERNAME);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof PasswordFragment.callBackListener) {
            passwordListener = (PasswordFragment.callBackListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnPasswordFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_password, container, false);

        TextView greetings = view.findViewById(R.id.tv_greetings);
        EditText password = view.findViewById(R.id.password);
        TextView wrongPassword = view.findViewById(R.id.inputError);
        Button submit = view.findViewById(R.id.submitButton);

        greetings.setText("Hi " + username + "!");

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwords = password.getText().toString();
                if (passwords.length() > 8) {
                    // Password is valid, perform desired action
                    wrongPassword.setText("");
                    passwordListener.onPasswordSuccess(username);
                } else {
                    // Display an error message
                    wrongPassword.setText("Password is less than 9 characters ");
                }
            }
        });

        return view;
    }
}