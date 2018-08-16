package com.sunny.android.letran_ce05.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.sunny.android.letran_ce05.R;
import com.sunny.android.letran_ce05.Person;

import java.util.ArrayList;

public class DataFragment extends ListFragment {

    private static final String ARG_DATALIST = "ARG_DATALIST";
    public DataFragment() {
        // Default empty constructor
    }

    public static DataFragment newInstance(ArrayList<Person> data) {

        Bundle args = new Bundle();

        args.putSerializable(ARG_DATALIST, data);

        DataFragment fragment = new DataFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.listview_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getArguments() != null) {
            ArrayList<Person> school = (ArrayList<Person>)getArguments().getSerializable(ARG_DATALIST);

            ArrayAdapter<Person> adapter = new ArrayAdapter<Person>(
                getActivity(), android.R.layout.simple_list_item_1, school
            );

            setListAdapter(adapter);
        }
    }
}
