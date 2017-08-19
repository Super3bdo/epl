package com.abdul.epl.api.util;

/**
 * Created by abdul on 7/29/17.
 */
public class EplRequest<T> {
    private String header;
    private T entity;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
