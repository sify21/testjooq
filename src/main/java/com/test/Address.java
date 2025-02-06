package com.test;

import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Address {
    private String state;
    private String street;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private OffsetDateTime builtTime;

    @Override
    public String toString() {
        return "{state=%s, street=%s, builtTime=%s}".formatted(state, street, builtTime);
    }

    public Address() {
    }

    public Address(String state, String street, OffsetDateTime builtTime) {
        this.state = state;
        this.street = street;
        this.builtTime = builtTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
