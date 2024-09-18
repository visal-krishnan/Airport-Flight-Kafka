package com.example.AirportAtc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RunwayAssignment {
    private String flightNumber;
    private String runway;

    // Getters and Setters
}
