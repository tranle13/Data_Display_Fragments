
    // Name: Tran Le
    // JAV1 - 1808
    // File name: InstructorFragment.java

package com.sunny.android.letran_ce05.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sunny.android.letran_ce05.R;

public class InstructorFragment extends Fragment {

    // Default empty constructor
    public InstructorFragment() {
        // Empty
    }

    public static InstructorFragment newInstance() {

        Bundle args = new Bundle();

        InstructorFragment fragment = new InstructorFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.instructor_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
