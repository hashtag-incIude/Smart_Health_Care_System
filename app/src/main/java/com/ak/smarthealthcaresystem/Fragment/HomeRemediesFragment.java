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
import com.ak.smarthealthcaresystem.databinding.FragmentHomeRemediesBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeRemediesFragment extends Fragment {


    private FragmentHomeRemediesBinding binding;
    private Context mContext;

    public HomeRemediesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeRemediesBinding.inflate(getLayoutInflater(), container, false);
        mContext = getContext();

        if (mContext == null)
            return binding.getRoot();
        CU.setActionBar(mContext, CS.Page.HOME_REMEDIES);

        return binding.getRoot();
    }

}
