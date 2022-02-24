package com.kuebiko.consultantService.dao;

import com.kuebiko.consultantService.entity.AddressDto;
import com.kuebiko.consultantService.models.Address;
import com.kuebiko.consultantService.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressDao extends BaseDao<Address>{

    @Autowired
    AddressRepo addressRepo;

    @Override
    public Address save(Address data) {

        // create a new DTO object so we can call the repo and save
        AddressDto addressDto = new AddressDto();

        String city = data.getCity();
        String street = data.getStreet();
        Long zip = data.getZipcode();
        String state = data.getState();

        addressDto.setStreet(street);
        addressDto.setCity(city);
        addressDto.setZipcode(zip);
        addressDto.setState(state);


        // Pass the dto to the repo.save function
        AddressDto savedDto = addressRepo.save(addressDto);

        // Take the dto from the repo and convert/map to Address
        Address response = new Address();
        response.setId(savedDto.getId());
        response.setStreet(savedDto.getStreet());
        response.setCity(savedDto.getCity());
        response.setState(savedDto.getState());
        response.setZipcode(savedDto.getZipcode());
        return response;
    }

    @Override
    public Address findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
