
    // Name: Tran Le
    // AID - 1808
    // File name: MainActivity.java

package com.sunny.android.letran_ce05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Person> dataCollection = new ArrayList<>();
    Spinner dropdown = null;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dropdown = (Spinner)findViewById(R.id.spn_Spinner);
        if (dropdown == null) {
            Log.i(TAG, "Spinner is null!");
        }

//        getSupportFragmentManager().beginTransaction().add(R.id.personFragmentHolder,
//                InstructorFragment.newInstance()).commit();
    }

    private Spinner.OnItemSelectedListener spinnerTapped = new Spinner.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    break;
                default:

                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
}
