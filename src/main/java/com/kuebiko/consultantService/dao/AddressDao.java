package com.kuebiko.consultantService.dao;

import com.kuebiko.consultantService.entity.AddressDto;
import com.kuebiko.consultantService.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressDao extends BaseDao{

    @Autowired
    AddressRepo addressRepo;

    @Override
    public Object save(Object data) {
        AddressDto addressDto = (AddressDto) data;
        addressDto = addressRepo.save(addressDto);
        return addressDto;
    }

    @Override
    public Object findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
