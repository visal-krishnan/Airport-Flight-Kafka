package com.example.AirportAtc.service;

import com.example.AirportAtc.model.Flight;
import com.example.AirportAtc.model.RunwayAssignment;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AtcService {

    @KafkaListener(topics = "flight-schedule", groupId = "atc-group")
    public void handleFlightScheduling(Flight flight) {
        // Logic to manage runway assignments
        RunwayAssignment assignment = new RunwayAssignment();
        assignment.setFlightNumber(flight.getFlightNumber());
        assignment.setRunway("Runway-1"); // Assign runway based on logic

        System.out.println("Assigned " + assignment.getRunway() + " to flight " + assignment.getFlightNumber());
    }
}