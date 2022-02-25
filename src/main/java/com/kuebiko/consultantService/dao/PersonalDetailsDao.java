package com.kuebiko.consultantService.dao;

import com.kuebiko.consultantService.entity.PersonalDetailsDto;
import com.kuebiko.consultantService.models.Address;
import com.kuebiko.consultantService.models.Education;
import com.kuebiko.consultantService.models.PersonalDetails;
import com.kuebiko.consultantService.repo.AddressRepo;
import com.kuebiko.consultantService.repo.EducationRepo;
import com.kuebiko.consultantService.repo.PersonalDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PersonalDetailsDao extends BaseDao <PersonalDetails> {

    @Autowired
    PersonalDetailsRepo personalDetailsRepo;

    @Autowired
    AddressRepo addressRepo;

    @Autowired
    EducationRepo educationRepo;

    @Override
    public PersonalDetails save(PersonalDetails data) {

        PersonalDetailsDto personalDetailsDto = new PersonalDetailsDto();

        String firstName = data.getFirstName();
        String lastName = data.getLastName();
        Date dob = data.getDob();
        Character gender = data.getGender();
        Address address = data.getAddress();
        Education education = data.getEducation();

        personalDetailsDto.setFirstName(firstName);
        personalDetailsDto.setLastName(lastName);
        personalDetailsDto.setDob(dob);
        personalDetailsDto.setGender(gender);
        personalDetailsDto.setAddressId(address.getId());
        personalDetailsDto.setEducationId(personalDetailsDto.getId());

        PersonalDetailsDto savedDto = personalDetailsRepo.save(personalDetailsDto);

        PersonalDetails response = new PersonalDetails();
        response.setFirstName(savedDto.getFirstName());
        response.setLastName(savedDto.getLastName());
        response.setDob(savedDto.getDob());
        response.setGender(savedDto.getGender());
//        response.setAddress(savedDto.getAddressId());
//        response.setEducation(savedDto.getEducationId());
        return response;
    }

    @Override
    public PersonalDetails findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
