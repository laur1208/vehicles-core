package com.vehicles.web;

import com.vehicles.api.CarPark;
import com.vehicles.api.Vehicles;
import com.vehicles.core.CarParkCore;
import com.vehicles.storage.CarParkStorage;
import com.vehicles.storage.CarsDb;
import org.springframework.stereotype.Component;

@Component
public class CarParkCoreComponent implements CarPark {

    private final CarPark carPark;

    public CarParkCoreComponent() {
        this(
                new CarParkCore(
                        new CarParkStorage(
                                new CarsDb()
                        )
                )
        );
    }

    public CarParkCoreComponent(CarPark carPark) {
        this.carPark = carPark;
    }

    @Override
    public Vehicles vehicles() {
        return this.carPark.vehicles();
    }
}
