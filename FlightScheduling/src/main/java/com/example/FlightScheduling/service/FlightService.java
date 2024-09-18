package com.example.FlightScheduling.service;

import com.example.FlightScheduling.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    private KafkaTemplate<String, Flight> kafkaTemplate;

    private static final String TOPIC = "flight-schedule";

    public void scheduleFlight(Flight flight) {
        kafkaTemplate.send(TOPIC, flight);
    }
}
