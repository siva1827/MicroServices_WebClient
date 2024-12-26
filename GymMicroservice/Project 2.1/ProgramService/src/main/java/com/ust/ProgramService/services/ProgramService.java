package com.ust.ProgramService.services;

import com.ust.ProgramService.dto.CustomerDto;
import com.ust.ProgramService.dto.ProgramDto;
import com.ust.ProgramService.dto.ResponseDto;
import com.ust.ProgramService.model.Program;
import com.ust.ProgramService.repository.ProgramRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class ProgramService {
    @Autowired
    private ProgramRepository repo;

    @Autowired
    private WebClient webClient;

    public Program addProgram(Program program) {
        return repo.save(program);
    }

    public List<Program> getProgramByGymId(int gymId) {
        return repo.findByGymId(gymId);
    }

    @CircuitBreaker(name = "programService", fallbackMethod = "fallbackGetGym")
    public ResponseDto getGym(int programId) {
        ResponseDto responseDto = new ResponseDto();
        Program program = repo.findById(programId).orElseThrow(() -> new RuntimeException("Program not found"));
        ProgramDto programDto = mapToProgramDto(program);

        List<CustomerDto> CustomerDtolist = webClient.get()
                .uri("http://localhost:9097/customer/" + program.getId())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<CustomerDto>>() {})
                .block();

        responseDto.setProgramDto(programDto);
        responseDto.setCustomerDtos(CustomerDtolist);

        return responseDto;
    }

    public ResponseDto fallbackGetGym(int programId, Throwable throwable) {
        // Handle the fallback logic, e.g., return a default response or log the error
        return new ResponseDto(); // Return an empty response or a default response
    }

    private ProgramDto mapToProgramDto(Program program) {
        ProgramDto programDto = new ProgramDto();
        programDto.setId(program.getId());
        programDto.setGymId(program.getGymId());
        programDto.setOprHrs(program.getOprHrs());
        programDto.setName(program.getName());

        return programDto;
    }

}
