package com.kuebiko.consultantService.service;

import com.kuebiko.consultantService.dao.AddressDao;
import com.kuebiko.consultantService.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements BaseServiceIf<Address>{

    @Autowired
    AddressDao addressDao;

    @Override
    public Address getId(Long id) {
        return null;
    }

    @Override
    public Address save(Object payload) {
        return null;
    }

    @Override
    public Address save(Address payload) {
        Address saveData = addressDao.save(payload);
        return saveData;
    }

    @Override
    public void delete(Long id) {

    }
}
