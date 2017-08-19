package com.abdul.epl.api.util;

/**
 * Created by abdul on 7/29/17.
 */
public class EplResponse<T> {
    private String repsonseCode;
    private String messsage;
    private T entity;

    public String getRepsonseCode() {
        return repsonseCode;
    }

    public void setRepsonseCode(String repsonseCode) {
        this.repsonseCode = repsonseCode;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public T getEntity() {
        return entity;
    }

    public void setEntity(T entity) {
        this.entity = entity;
    }
}
