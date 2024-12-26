package com.ust.GymService.services;

import com.ust.GymService.dto.CustomerDto;
import com.ust.GymService.dto.GymDto;
import com.ust.GymService.dto.ProgramDto;
import com.ust.GymService.dto.ResponseDto;
import com.ust.GymService.model.Gym;
import com.ust.GymService.repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class GymService {

    @Autowired
    private GymRepository repo;

    @Autowired
    private WebClient.Builder webClientBuilder;


    public Gym addGym(Gym gym) {
        return repo.save(gym);
    }

    public ResponseDto getGym(int id) {
        ResponseDto responseDto = new ResponseDto();
        Gym gym = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Gym not found"));
        GymDto gymDto = mapToGym(gym);

        // Fetch flights for the airline
        List<ProgramDto> ProgramDtoList = webClientBuilder.baseUrl("http://localhost:9098")
                .build()
                .get()
                .uri("/program/" + gym.getId())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<ProgramDto>>() {})
                .block();


        for (ProgramDto programDto : ProgramDtoList) {
            List<CustomerDto> customerDtoList = webClientBuilder.baseUrl("http://localhost:9097")
                    .build()
                    .get()
                    .uri("/customer/" + programDto.getId())
                    .retrieve()
                    .bodyToMono(new ParameterizedTypeReference<List<CustomerDto>>() {})
                    .block();

            programDto.setCustomerDtoList(customerDtoList);
        }

        responseDto.setGymDto(gymDto);
        responseDto.setProgramDtos(ProgramDtoList);

        return responseDto;
    }

    private GymDto mapToGym(Gym gym) {
        GymDto dto = new GymDto();
        dto.setName(gym.getName());
        dto.setId(gym.getId());
        dto.setLocation(gym.getLocation());
        dto.setNoTrainers(gym.getNoTrainers());
        return dto;
    }

}
