package com.example.farmer_crud.service;

import com.example.farmer_crud.model.SeedSample;
import com.example.farmer_crud.repo.SeedSampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class SeedSampleServiceImpl implements SeedSampleService {
    @Autowired
    private SeedSampleRepository seedSampleRepository;

    public SeedSample saveSeedSample(SeedSample seedSample){
        return seedSampleRepository.save(seedSample);
    }

    // Task-1
    // dto for both req and resp
    // input field validatioin with hibernate validator


    // seedSample name unique validation before save
    // getBySampleId(sampleId) -- if not found exception

}
