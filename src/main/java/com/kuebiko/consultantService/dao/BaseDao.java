package com.kuebiko.consultantService.dao;

public abstract class BaseDao<T> {
    public abstract T save(T data);
    public abstract T findById (Long id);
    public abstract void delete (Long id);
}
