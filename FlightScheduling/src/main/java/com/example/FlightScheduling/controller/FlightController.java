package com.example.FlightScheduling.controller;

import com.example.FlightScheduling.model.Flight;
import com.example.FlightScheduling.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/schedule")
    public String scheduleFlight(@RequestBody Flight flight) {
        flightService.scheduleFlight(flight);
        return "Flight scheduled successfully!";
    }
}