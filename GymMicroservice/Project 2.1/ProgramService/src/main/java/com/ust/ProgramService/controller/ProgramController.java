package com.ust.ProgramService.controller;

import com.ust.ProgramService.dto.ResponseDto;
import com.ust.ProgramService.model.Program;
import com.ust.ProgramService.services.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/program")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @PostMapping("/addprogram")
    public Program addProgram(@RequestBody Program program) {
        return programService.addProgram(program);
    }

    @GetMapping("{gymId}")
    public List<Program> getProgramByGymId(@PathVariable int gymId){
        return programService.getProgramByGymId(gymId);
    }

    @GetMapping("withCustomer/{programId}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("programId") int programId){
        ResponseDto responseDto = programService.getGym(programId);
        return ResponseEntity.ok(responseDto);
    }
}
