package com.greenfox.dzlica.orientationexam.controllers;

import com.greenfox.dzlica.orientationexam.repositories.PlateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlateController {

    @Autowired
    PlateRepo plateRepo;

    @RequestMapping("/search")
    public String list(Model model, @RequestParam(required = false) String q, @RequestParam(required = false) boolean police, @RequestParam(required = false) boolean diplomat) {
        if (q == null) {
            q = "";
        }
        if (police) {
            model.addAttribute("plates", plateRepo.findAllByPlateIsLike("RB%" + q + "%"));
        } else if (diplomat) {
            model.addAttribute("plates", plateRepo.findAllByPlateIsLike("DT%" + q + "%"));
        } else {
            model.addAttribute("plates", plateRepo.findAllByPlateIsLike("%" + q + "%"));
        }
        return "index";
    }



    @GetMapping("search/{brand}")
    public String serachBrand(Model model, @PathVariable String brand) {
        model.addAttribute("plates", plateRepo.findAllByCarBrand(brand));
        return "index";
    }

}
