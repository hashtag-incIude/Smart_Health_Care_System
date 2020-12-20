package com.ak.smarthealthcaresystem.Fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ak.smarthealthcaresystem.R;
import com.ak.smarthealthcaresystem.Utilities.CS;
import com.ak.smarthealthcaresystem.Utilities.CU;
import com.ak.smarthealthcaresystem.databinding.FragmentAboutBinding;


public class AboutFragment extends Fragment {


    private Context mContext;
    private FragmentAboutBinding binding;

    public AboutFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(inflater, container, false);
        mContext = getContext();
        if (mContext == null)
            return binding.getRoot();
        CU.setActionBar(mContext, CS.Page.ABOUT);
        return binding.getRoot();
    }

}
