package com.vehicles.web.output;


import com.vehicles.api.Vehicle;

import javax.json.Json;

public class JsonVehicle extends AbstractJsonObject {

    public JsonVehicle(final Vehicle vehicle) {
        super(
                Json.createObjectBuilder()
                        .add("vehicleId", vehicle.id()).build()
        );
    }
}
