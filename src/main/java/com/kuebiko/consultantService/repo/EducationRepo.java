package com.kuebiko.consultantService.repo;

import com.kuebiko.consultantService.entity.EducationDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends JpaRepository<EducationDto,Long> {
}
