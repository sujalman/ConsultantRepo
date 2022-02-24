package com.kuebiko.consultantService.service;

import com.kuebiko.consultantService.dao.EducationDao;
import com.kuebiko.consultantService.models.Education;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements BaseServiceIf<Education> {

    @Autowired
    EducationDao educationDao;

    @Override
    public Education getId(Long id) {
        return null;
    }

    @Override
    public Education save(Education payload) {
        Education saveData = educationDao.save(payload);
        return saveData;
    }

    @Override
    public void delete(Long id) {

    }
}
