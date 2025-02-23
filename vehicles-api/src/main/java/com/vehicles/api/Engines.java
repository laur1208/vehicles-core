package com.vehicles.api;


public interface Engines extends Iterable<Engine>{

    Engine insert(Engine engine);

    Engine update(Engine engine);

    Engine getByType(String type);

}
