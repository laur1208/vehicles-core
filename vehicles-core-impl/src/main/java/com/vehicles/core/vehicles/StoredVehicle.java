package com.vehicles.core.vehicles;

import com.bmw.api.Car;
import com.bmw.core.rest.RestBMW;
import com.vehicles.api.Vehicle;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StoredVehicle implements Vehicle {
    
    private final Integer id;

    @Override
    public Integer id() {
        //should external Rest reference be used here?
        Car car = new RestBMW().cars().getById(id);
        return this.id;
    }
}
