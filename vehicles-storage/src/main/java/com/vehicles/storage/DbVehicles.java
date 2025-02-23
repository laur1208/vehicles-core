package com.vehicles.storage;

import com.bmw.api.Car;
import com.bmw.core.rest.RestBMW;
import com.vehicles.api.Storage;
import com.vehicles.api.Vehicle;
import com.vehicles.api.Vehicles;
import com.vehicles.core.vehicles.StoredVehicle;
import lombok.RequiredArgsConstructor;

import javax.json.JsonObject;

@RequiredArgsConstructor
public class DbVehicles implements Vehicles {

    private final Storage storage;

    private final Database database;

    @Override
    public Vehicle insert(JsonObject vehicle) {
        System.out.println("vehicle.getString(\"name\") = " + vehicle.getString("name"));
        System.out.println("vehicle.getString(\"id\") = " + vehicle.getInt("id"));
        return new StoredVehicle(
                vehicle.getInt("id"),
                vehicle.getString("name")
        );
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return null;
    }

    @Override
    public void delete(Vehicle vehicle) {

    }

    @Override
    public Vehicle getById(Integer id) {

        //should external Rest reference be used here?
        Car car = new RestBMW().cars().getById(id);

        return new StoredVehicle(car.id(), "asd");
    }

    @Override
    public Vehicles ofUser(String username) {
        return null;
    }
}
