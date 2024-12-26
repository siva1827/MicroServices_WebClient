package com.ust.GymService.controller;

import com.ust.GymService.dto.ResponseDto;
import com.ust.GymService.model.Gym;
import com.ust.GymService.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Gym")
public class GymController {

    @Autowired
    private GymService gymService;

    @PostMapping("/addGym")
    public ResponseEntity<Gym> addGym(@RequestBody Gym gym){
        return ResponseEntity.ok(gymService.addGym(gym));
    }

    @GetMapping("{GymId}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("GymId") int id){
        ResponseDto responseDto=gymService.getGym(id);
        return ResponseEntity.ok(responseDto);
    }
}
