package com.luseen.spacenavigationview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luseen.spacenavigation.SpaceNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpaceNavigationView spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
//        spaceNavigationView.setSpaceBackgroundColor(ContextCompat.getColor(this,android.R.color.holo_green_dark));
//        spaceNavigationView.setCentreButtonColor(ContextCompat.getColor(this,android.R.color.holo_orange_light));
        //spaceNavigationView.setCentreButtonIcon(android.R.drawable.sym_call_incoming);

//        FrameLayout r = (FrameLayout) findViewById(R.id.activity_main);
//        FrameLayout.LayoutParams mainContentParams =
//                new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        centreContent.setBackgroundColor(ContextCompat.getColor(this, R.color.neee));
//        mainContentParams.setMargins(0, 0, 0, 0);
//        r.addView(centreContent, mainContentParams);

    }
}
