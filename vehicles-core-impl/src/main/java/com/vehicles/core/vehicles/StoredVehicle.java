package com.vehicles.core.vehicles;

import com.vehicles.api.Vehicle;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StoredVehicle implements Vehicle {
    
    private final Integer id;

    @Override
    public Integer id() {
        return this.id;
    }
}
