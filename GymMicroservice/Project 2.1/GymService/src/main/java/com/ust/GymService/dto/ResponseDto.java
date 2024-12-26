package com.ust.GymService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    public GymDto getGymDto() {
        return gymDto;
    }

    public void setGymDto(GymDto gymDto) {
        this.gymDto = gymDto;
    }

    public List<ProgramDto> getProgramDtos() {
        return programDtos;
    }

    public void setProgramDtos(List<ProgramDto> programDtos) {
        this.programDtos = programDtos;
    }

    private GymDto gymDto;
    private List<ProgramDto> programDtos;
}
