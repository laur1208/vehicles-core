package com.vehicles.storage;


import org.springframework.jdbc.core.JdbcTemplate;

public interface Database {

    Database connect();

    JdbcTemplate jdbc();

    void close();

}
