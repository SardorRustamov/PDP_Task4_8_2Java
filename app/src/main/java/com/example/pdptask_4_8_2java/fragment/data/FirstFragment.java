package com.example.pdptask_4_8_2java.fragment.data;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.pdptask_4_8_2java.R;
import com.example.pdptask_4_8_2java.data.DataClass;
import com.example.pdptask_4_8_2java.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    FragmentFirstBinding binding;
    private FirstListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);

        binding.btnFirst.setOnClickListener(view -> {

            String name = binding.editName.getText().toString();
            String text = binding.editText.getText().toString();

            DataClass dataClass = new DataClass(name, text);

            listener.onFirstSend(dataClass);
        });
        return binding.getRoot();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof FirstListener){
            listener = (FirstListener) context;
        } else {
            throw  new RuntimeException(context.toString() + "must implement FirstListener");
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface FirstListener{
        void onFirstSend(DataClass dataClass);
    }
}