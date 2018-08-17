
    // Name: Tran Le
    // AID - 1808
    // File name: MainActivity.java

package com.sunny.android.letran_ce05;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

import com.sunny.android.letran_ce05.fragments.AdminFragment;
import com.sunny.android.letran_ce05.fragments.DataFragment;
import com.sunny.android.letran_ce05.fragments.InstructorFragment;
import com.sunny.android.letran_ce05.fragments.StudentFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements StudentFragment.AddStudent {

    ArrayList<Person> dataCollection = new ArrayList<>();
    Spinner dropdown = null;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            dropdown = (Spinner) findViewById(R.id.spn_Spinner);
            dropdown.setOnItemSelectedListener(spinnerTapped);

            getSupportFragmentManager().beginTransaction().replace(R.id.personFragmentHolder,
                    StudentFragment.newInstance()).commit();
            getSupportFragmentManager().beginTransaction().add(R.id.listViewFragmentHolder,
                    DataFragment.newInstance(dataCollection)).commit();

            ((Button)findViewById(R.id.btn_Refresh)).setOnClickListener(refreshTapped);
        }
    }

    private Spinner.OnItemSelectedListener spinnerTapped = new Spinner.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 1:
                    getSupportFragmentManager().beginTransaction().replace(R.id.personFragmentHolder,
                            InstructorFragment.newInstance()).commit();
                    break;
                case 2:
                    getSupportFragmentManager().beginTransaction().replace(R.id.personFragmentHolder,
                            AdminFragment.newInstance()).commit();
                    break;
                default:
                    getSupportFragmentManager().beginTransaction().replace(R.id.personFragmentHolder,
                            StudentFragment.newInstance()).commit();
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
            Log.i(TAG, "NOTHING IS SELECTED");
        }
    };

    private View.OnClickListener refreshTapped = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            getSupportFragmentManager().beginTransaction().replace(R.id.listViewFragmentHolder,
                    DataFragment.newInstance(dataCollection)).commit();
        }
    };

    @Override
    public void addStudent(Student pupil) {
        dataCollection.add(pupil);
    }
}
