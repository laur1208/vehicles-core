package com.vehicles.web;

import com.vehicles.api.CarPark;
import com.vehicles.api.Vehicle;
import com.vehicles.web.output.JsonVehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        Vehicle car = this.carPark.vehicles().getById(id);
        System.out.println("vehicle.id() = " + car.id());
        return ResponseEntity.ok(new JsonVehicle(car).toString());
    }
}
