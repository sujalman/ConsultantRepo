package com.kuebiko.consultantService.dao;

import com.kuebiko.consultantService.entity.AddressDto;
import com.kuebiko.consultantService.entity.PersonalDetailsDto;
import com.kuebiko.consultantService.models.Address;
import com.kuebiko.consultantService.models.PersonalDetails;
import com.kuebiko.consultantService.repo.AddressRepo;
import com.kuebiko.consultantService.repo.PersonalDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonalDetailsDao extends  BaseDao <PersonalDetails> {

    @Autowired
    PersonalDetailsRepo personalDetailsRepo;

    @Autowired
    AddressRepo addressRepo;

    @Override
    public PersonalDetails save(PersonalDetails data) {
        PersonalDetailsDto personalDetailsDto = new PersonalDetailsDto();
        personalDetailsDto.setFirstName(data.getFirstName());
        personalDetailsDto.setLastName(data.getLastName());
        personalDetailsDto.setDob(data.getDob());
        personalDetailsDto.setGender(data.getGender());
        personalDetailsDto.setAddressId(data.getAddress().getId());
        personalDetailsDto.setEducationId(data.getEducation().getId());


        PersonalDetailsDto savedDto = personalDetailsRepo.save(personalDetailsDto);

        PersonalDetails response = new PersonalDetails();
        response.setFirstName(savedDto.getFirstName());
        response.setLastName(savedDto.getLastName());
        response.setDob(savedDto.getDob());
        response.setGender(savedDto.getGender());

        Long id = savedDto.getAddressId();
        if (id != null){
            AddressDto addressDto = addressRepo.getById(id);
            if (addressDto !=null){
                Address address = new Address();
                address.setId(id);
                address.setStreet(addressDto.getStreet());
                address.setCity(addressDto.getCity());
                address.setZipcode(addressDto.getZipcode());
                addressDto.setState(addressDto.getState());

                response.setAddress(address);

            }
        }
        return response;

    }

    @Override
    public PersonalDetails findById(Long id) {
        PersonalDetailsDto personalDetailsDto= personalDetailsRepo.getById(id);
        if (personalDetailsDto != null) {
            PersonalDetails response = new PersonalDetails();
            response.setFirstName(personalDetailsDto.getFirstName());
            response.setLastName(personalDetailsDto.getLastName());
            response.setDob(personalDetailsDto.getDob());
            response.setGender(personalDetailsDto.getGender());

            Long addressId = personalDetailsDto.getAddressId();
            if (addressId != null) {
                AddressDto addressDto = addressRepo.getById(addressId);
                if (addressDto != null) {
                    Address address = new Address();
                    address.setId(id);
                    address.setStreet(addressDto.getStreet());
                    address.setCity(addressDto.getCity());
                    address.setZipcode(addressDto.getZipcode());
                    addressDto.setState(addressDto.getState());

                    response.setAddress(address);

                }
                return response;

            }
        } else {
            return null;
        }
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
