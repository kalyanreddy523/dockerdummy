package com.example.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.data.entity.DataEntity;
import com.example.data.repository.DataRepository;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping
    public Iterable<DataEntity> getAllData() {
        return dataRepository.findAll();
    }

    @PostMapping
    public DataEntity addData(@RequestBody DataEntity data) {
        return dataRepository.save(data);
    }
}

