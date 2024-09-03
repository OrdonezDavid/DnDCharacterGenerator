package org.example.demo1test.controllers;

import org.example.demo1test.dtos.DummyDto;
import org.example.demo1test.models.Dummy;
import org.example.demo1test.services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @Autowired
    private DummyService dummyService;


    @GetMapping("")
    public ResponseEntity<DummyDto> getDummyList() {
        List<Dummy> dummyList = dummyService.getDummyList();

        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DummyDto> getDummyById(@PathVariable Long id) {
        Dummy dummy = dummyService.getDummy(id);

        return null;
    }


    @PostMapping("")
    public ResponseEntity<DummyDto> createDummy( DummyDto dto) {
        Dummy dummy = dummyService.createDummy(null);
        return null;
    }

    @PutMapping
    public ResponseEntity<DummyDto> updateDummy( DummyDto dto) {
        Dummy dummy = dummyService.updateDummy(null);
        return null;
    }

    @DeleteMapping
    public ResponseEntity<DummyDto> deleteDummy( DummyDto dto) {
        dummyService.deleteDummy(null);
        return null;
    }


}