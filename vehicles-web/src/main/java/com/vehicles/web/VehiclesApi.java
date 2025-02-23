package com.vehicles.web;

import com.vehicles.api.CarPark;
import com.vehicles.api.Vehicle;
import com.vehicles.web.input.InputJsonVehicle;
import com.vehicles.web.output.JsonVehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class VehiclesApi {

    private final CarPark carPark;

    @GetMapping(
            value = "/vehicles/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> getCar(
            @PathVariable("id") final Integer id
    ) {
        Vehicle car = this.carPark.user().vehicles().getById(id);
        System.out.println("vehicle.id() = " + car.id());
        return ResponseEntity.ok(new JsonVehicle(car).toString());
    }

    @PostMapping(
            value = "/vehicles",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<String> insertCar(
            @RequestBody InputJsonVehicle input
    ) {
        Vehicle car = this.carPark.user().vehicles().insert(input);
        if (car == null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(new JsonVehicle(car).toString());
        }
    }
}
