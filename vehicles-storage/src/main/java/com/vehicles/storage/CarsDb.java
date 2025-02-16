package com.vehicles.storage;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;

@RequiredArgsConstructor
public class CarsDb implements Database {
    @Override
    public Database connect() {
        return null;
    }

    @Override
    public JdbcTemplate jdbc() {
        return null;
    }

    @Override
    public void close() {

    }
}
