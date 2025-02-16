package com.vehicles.storage;

import com.vehicles.api.Storage;
import com.vehicles.api.Vehicles;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarParkStorage implements Storage {

    private final Database database;

    @Override
    public Vehicles vehicles() {
        return new DbVehicles(this, this.database);
    }
}
