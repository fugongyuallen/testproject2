package com.allensupercompany.testproject.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.allensupercompany.testproject.MainActivity;
import com.allensupercompany.testproject.R;

/**
 * Created by allenF on 4/13/16.
 */
public class Junit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public Junit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();
        assertEquals("Hello World",tester);
    }
}
