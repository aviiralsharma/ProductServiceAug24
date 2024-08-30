package com.example.ProductServiceAug24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    // Endpoint name: GET /hello
    @GetMapping("/hello")
    public String HelloWorl(){
        return "Hello World";
    }

    // Endpoint name: GET /hello/{name}
    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    // Endpoint name: Get /show/showID/seat/seatID
    @GetMapping("/show/{showID}/seat/{seatID}")
    public String showAvailable(@PathVariable("showID") String showID, @PathVariable("seatID") int seatID) {
        return "Show ID is " + showID + " and seat ID is " + seatID;
    }
}


