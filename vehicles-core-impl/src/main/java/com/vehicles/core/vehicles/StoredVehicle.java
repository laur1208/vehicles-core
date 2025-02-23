package com.vehicles.core.vehicles;

import com.bmw.api.Car;
import com.bmw.core.rest.RestBMW;
import com.vehicles.api.Engine;
import com.vehicles.api.Vehicle;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StoredVehicle implements Vehicle {
    
    private final Integer id;

    private final String name;

    @Override
    public Integer id() {
        //should external Rest reference be used here?
        Car car = new RestBMW().cars().getById(this.id);
        return this.id;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Engine engine() {
        return null;
    }
}
