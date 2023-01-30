package com.example.pdptask_4_8_2java.fragment.data;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pdptask_4_8_2java.data.DataClass;
import com.example.pdptask_4_8_2java.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    public SecondFragment() {
        // Required empty public constructor
    }

    FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void updateSecondFragment(DataClass data){
        binding.text.setText(data.getText());
        binding.name.setText(data.getName());
    }

}