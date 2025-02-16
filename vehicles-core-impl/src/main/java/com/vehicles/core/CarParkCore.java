package com.vehicles.core;

import com.vehicles.api.CarPark;
import com.vehicles.api.Storage;
import com.vehicles.api.Vehicles;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CarParkCore implements CarPark {

    private final Storage storage;

    @Override
    public Vehicles vehicles() {
        return this.storage.vehicles();
    }
}
