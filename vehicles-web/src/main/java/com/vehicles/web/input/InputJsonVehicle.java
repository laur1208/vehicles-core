package com.vehicles.web.input;

import com.vehicles.api.Engine;
import com.vehicles.api.Vehicle;
import com.vehicles.web.output.AbstractJsonObject;

import javax.json.Json;
import javax.json.JsonObject;
import java.util.function.Supplier;

public class InputJsonVehicle extends AbstractJsonObject implements Vehicle {

    private String name;
    private Integer id;

    public InputJsonVehicle(String name, Integer id) {
        super(() ->
                Json.createObjectBuilder()
                        .add("name", name)
                        .add("id", id)
                        .build()
        );
        this.name = name;
        this.id = id;
    }

    public InputJsonVehicle(Supplier<JsonObject> delegate) {
        super(delegate);
    }

    @Override
    public Integer id() {
        return this.id;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Engine engine() {
        return null;
    }
}
