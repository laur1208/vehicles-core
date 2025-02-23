package com.vehicles.api;

import javax.json.JsonObject;

public interface Vehicles {

    Vehicle insert(JsonObject vehicle);

    Vehicle update(Vehicle vehicle);

    void delete(Vehicle vehicle);

    Vehicle getById(final Integer id);

    Vehicles ofUser(String username);

}
