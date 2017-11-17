package com.greenfox.dzlica.orientationexam.controllers;

import com.greenfox.dzlica.orientationexam.model.Plate;
import com.greenfox.dzlica.orientationexam.model.Response;
import com.greenfox.dzlica.orientationexam.repositories.PlateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlateRestController {

    @Autowired
    PlateRepo plateRepo;


    @GetMapping("/api/search/{brand}")
    public Object brand(@PathVariable String brand) {
        Response response = new Response("ok");
        response.setData(plateRepo.findAllByCarBrand(brand));
        return response;
    }

}