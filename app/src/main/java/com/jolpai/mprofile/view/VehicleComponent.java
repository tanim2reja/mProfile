package com.jolpai.mprofile.view;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by User on 11/12/2017.
 */
@Singleton
@Component(modules = VehicleModule.class)
public interface VehicleComponent {

    Vehicle provideVehicle();
}
