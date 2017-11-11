package com.jolpai.mprofile.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jolpai.mprofile.R;

/**
 * Created by Tanim Reja on 11/5/2017.
 */

public class Home_V extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = initDagger();
        vehicle = component.provideVehicle();

        Toast.makeText(this, vehicle.getSpeed() + "", Toast.LENGTH_SHORT).show();

    }

    protected VehicleComponent initDagger() {
        return DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
    }

}
