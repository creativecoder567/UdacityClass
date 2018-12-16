package com.example.sarath.udacityclass.architectural_components.ui.architecturemain;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sarath.udacityclass.R;


public class ArchitectureMainFragment extends Fragment {

    private ArchitectureMainViewModel mViewModel;

    public static ArchitectureMainFragment newInstance() {
        return new ArchitectureMainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.architecture_main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ArchitectureMainViewModel.class);
        // TODO: Use the ViewModel
    }

}
