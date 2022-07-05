package com.example.farmer_crud.service;

import com.example.farmer_crud.model.SeedSample;
import com.example.farmer_crud.repo.SeedSampleRepository;
import org.springframework.stereotype.Service;


public interface SeedSampleService {
    SeedSample saveSeedSample(SeedSample seedSample);

}
