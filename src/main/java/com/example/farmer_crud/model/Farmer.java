package com.example.farmer_crud.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "farmer")
public class Farmer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private Long contactno;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "farmer_id")
    private List<SeedSample> seedSampleList;

    public Farmer() {
    }

    public Farmer(int id, String firstname, String lastname, String address, Long contactno) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.contactno = contactno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getContactno() {
        return contactno;
    }

    public void setContactno(Long contactno) {
        this.contactno = contactno;
    }
}
