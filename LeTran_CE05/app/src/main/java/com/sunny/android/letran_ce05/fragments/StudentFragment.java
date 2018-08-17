package com.sunny.android.letran_ce05.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.sunny.android.letran_ce05.R;
import com.sunny.android.letran_ce05.Student;

public class StudentFragment extends Fragment implements View.OnClickListener {

    AddStudent addPupil;

    public interface AddStudent {
        public void addStudent(Student pupil);
    }

    public StudentFragment() {
        // Default empty constructor
    }

    public static StudentFragment newInstance() {

        Bundle args = new Bundle();

        StudentFragment fragment = new StudentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        
        if (context instanceof AddStudent) {
            addPupil = (AddStudent)context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.student_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (getView() != null) {
            Button addStudent = getView().findViewById(R.id.btn_AddStudent);
            addStudent.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        if (getView() != null) {
            EditText first = (EditText)getView().findViewById(R.id.txt_StudentFirstName);
            EditText last = (EditText)getView().findViewById(R.id.txt_StudentLastName);
            EditText id = (EditText)getView().findViewById(R.id.txt_StudentId);
            addPupil.addStudent(new Student(first.getText().toString(), last.getText().toString(),
                    id.getText().toString()));
            first.setText("");
            last.setText("");
            id.setText("");
        }
    }
}
