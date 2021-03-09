package com.daveberzack.bootcamp.assessment.controller;

import com.daveberzack.bootcamp.assessment.response.AdderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.daveberzack.bootcamp.assessment.service.AdderService;

@CrossOrigin("*")
@RestController
public class AdderController {

    @Autowired
    private AdderService adderService;

    @GetMapping(value = "add/{addend1}/{addend2}")
    public AdderResponse getSumOfValues(@PathVariable("addend1") String addend1, @PathVariable("addend2") String addend2) {
        try {
            int result = adderService.addNumbers(Integer.parseInt(addend1), Integer.parseInt(addend2));
            return new AdderResponse(200, "", result);
        }
        catch (Exception e) {
            return new AdderResponse(500, "Invalid addend(s)", 0);
        }

    }

    @GetMapping(value = "add/{addend1}")
    public AdderResponse getSumOfValues(@PathVariable("addend1") String addend1) {
        try {
            return new AdderResponse(200, "", Integer.parseInt(addend1));
        }
        catch (Exception e) {
            return new AdderResponse(500, "Invalid addend", 0);
        }

    }
}
