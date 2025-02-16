package com.vehicles.storage;

import com.bmw.api.Car;
import com.bmw.core.rest.RestBMW;
import com.vehicles.api.Storage;
import com.vehicles.api.Vehicle;
import com.vehicles.api.Vehicles;
import com.vehicles.core.vehicles.StoredVehicle;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DbVehicles implements Vehicles {

    private final Storage storage;

    private final Database database;

    @Override
    public Vehicle getById(Integer id) {

        Car car = new RestBMW().cars().getById(id);

        return new StoredVehicle(car.id());
    }
}
