package com.ak.smarthealthcaresystem.Fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ak.smarthealthcaresystem.R;
import com.ak.smarthealthcaresystem.Utilities.CS;
import com.ak.smarthealthcaresystem.Utilities.CU;
import com.ak.smarthealthcaresystem.databinding.FragmentSettingsBinding;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettingsFragment extends Fragment {

    private Context mContext;
    private String TAG = "SettingsFragment";
    private FragmentSettingsBinding binding;

    public SettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(getLayoutInflater(), container, false);
        mContext = getContext();

        if (mContext == null)
            return binding.getRoot();
        CU.setActionBar(mContext, CS.Page.SETTINGS);

        SharedPreferences sp = mContext.getSharedPreferences("GC", MODE_PRIVATE);
        long type = sp.getLong(CS.type, 1);
        Log.e(TAG, "onCreateView: " + type);
        CU.setLayout(type, binding.flDoctor, binding.flGovernment, binding.flLab, null, null);
        return binding.getRoot();
    }


}