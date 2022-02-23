package com.kuebiko.consultantService.dao;

public abstract class BaseDao {
    public abstract Object save(Object data);
    public abstract Object findById (Long id);
    public abstract void delete (Long id);
}
