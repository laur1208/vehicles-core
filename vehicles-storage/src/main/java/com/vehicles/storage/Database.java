package com.vehicles.storage;


import com.vehicles.api.CarPark;
import org.springframework.jdbc.core.JdbcTemplate;

public interface Database {

    Database connect();

    JdbcTemplate jdbc();

    void close();

}
