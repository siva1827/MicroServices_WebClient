package com.ust.ProgramService.repository;

import com.ust.ProgramService.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramRepository extends JpaRepository<Program,Integer> {


    List<Program> findByGymId(int gymId);
}
