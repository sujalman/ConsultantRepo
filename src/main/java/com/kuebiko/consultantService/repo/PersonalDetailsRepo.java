package com.kuebiko.consultantService.repo;

import com.kuebiko.consultantService.entity.PersonalDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepo extends JpaRepository<PersonalDetailsDto,Long> {
}
