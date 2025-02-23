package com.vehicles.storage;

import com.vehicles.api.Storage;
import com.vehicles.api.User;
import com.vehicles.api.Vehicles;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DbUser implements User {

    private final Storage storage;

    private final Database database;

    @Override
    public Vehicles vehicles() {
        return new DbVehicles(this.storage, this.database);
    }
}
