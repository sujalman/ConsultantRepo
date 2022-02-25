package com.kuebiko.consultantService.service;

import com.kuebiko.consultantService.dao.PersonalDetailsDao;
import com.kuebiko.consultantService.models.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalDetailsService implements BaseServiceIf<PersonalDetails> {

    @Autowired
    PersonalDetailsDao personalDetailsDao;

    @Override
    public PersonalDetails getId(Long id) {
        return null;
    }

    @Override
    public PersonalDetails save(PersonalDetails payload) {
        PersonalDetails saveData = personalDetailsDao.save(payload);
        return saveData;
    }

    @Override
    public void delete(Long id) {

    }
}
