package com.greenfox.dzlica.orientationexam.controllers;

import com.greenfox.dzlica.orientationexam.repositories.PlateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlateRestController {

    @Autowired
    PlateRepo plateRepo;


 //   @GetMapping("/api/search/{brand}")

}
