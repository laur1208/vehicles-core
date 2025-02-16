package com.vehicles.storage;

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
        return new StoredVehicle(id);
    }
}
