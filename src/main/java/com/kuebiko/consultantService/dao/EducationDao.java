package com.kuebiko.consultantService.dao;

import com.kuebiko.consultantService.entity.EducationDto;
import com.kuebiko.consultantService.models.Education;
import com.kuebiko.consultantService.repo.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class EducationDao extends BaseDao <Education>{

    @Autowired
    EducationRepo educationRepo;

    @Override
    public Education save(Education data) {

        EducationDto educationDto = new EducationDto();

        String university = data.getUniversity();
        Boolean graduated = data.getGraduated();
        Double gpa = data.getGpa();
        Date graduateDate = data.getGraduateDate();

        educationDto.setUniversity(university);
        educationDto.setGraduated(graduated);
        educationDto.setGpa(gpa);
        educationDto.setGraduateDate(graduateDate);

        EducationDto savedDto = educationRepo.save(educationDto);

        Education response = new Education();
        response.setId(savedDto.getId());
        response.setUniversity(savedDto.getUniversity());
        response.setGraduated(savedDto.getGraduated());
        response.setGpa(savedDto.getGpa());
        response.setGraduateDate(savedDto.getGraduateDate());
        return response;
    }

    @Override
    public Education findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
