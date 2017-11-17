package com.greenfox.dzlica.orientationexam.controllers;

import com.greenfox.dzlica.orientationexam.repositories.PlateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlateController {

    @Autowired
    PlateRepo plateRepo;

    @RequestMapping({"", "/"})
    public String list(Model model, @RequestParam(required = false) String search) {
        if (search != null) {
            model.addAttribute("plates",  plateRepo.findAllByPlateIsLike("%" + search + "%"));
        }
        return "index";
    }

}
