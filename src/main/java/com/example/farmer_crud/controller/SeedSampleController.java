package com.example.farmer_crud.controller;

import com.example.farmer_crud.model.SeedSample;
import com.example.farmer_crud.service.SeedSampleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeedSampleController {

    private final SeedSampleService service;

    public SeedSampleController(SeedSampleService service) {
        this.service = service;
    }


    @PostMapping("/addSeedSample")
    public SeedSample addSeedSample(@RequestBody SeedSample seedSample){
        return service.saveSeedSample(seedSample);
    }
}
