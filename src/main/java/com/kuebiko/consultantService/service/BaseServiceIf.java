package com.kuebiko.consultantService.service;

import com.kuebiko.consultantService.models.Address;

public interface BaseServiceIf<T> {

    public T getId(Long id);
    public T save(Object payload);

    Address save(Address payload);

    public void delete(Long id);
}
