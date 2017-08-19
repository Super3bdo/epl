package com.abdul.epl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by abdul on 7/29/17.
 */
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    //private Date birthDate;
    private String fifaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return "";
    }
    /*public Date getBirthDate() {
        return birthDate;
    }

    @JsonSerialize()
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    */
    public String getFifaId() {
        return fifaId;
    }

    public void setFifaId(String fifaId) {
        this.fifaId = fifaId;
    }
}
