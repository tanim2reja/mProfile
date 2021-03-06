package com.jolpai.mprofile.view;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by User on 11/12/2017.
 */

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }

}
