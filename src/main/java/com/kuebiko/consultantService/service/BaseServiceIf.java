package com.kuebiko.consultantService.service;

public interface BaseServiceIf<T> {

    public T getId(Long id);
    public T save(T payload);
    public void delete(Long id);
}
