package com.example.farmer_crud.model;

import javax.persistence.*;

@Entity
@Table(name="seed_Address")
public class SeedAddress extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String addressname;

    @OneToOne
    @JoinColumn(name = "addressid",referencedColumnName = "id")
    private SeedSample seedSample;

    public SeedAddress() {
    }

    public SeedAddress(int id, String addressname, SeedSample seedSample) {
        this.id = id;
        this.addressname = addressname;
        this.seedSample = seedSample;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddressname() {
        return addressname;
    }

    public void setAddressname(String addressname) {
        this.addressname = addressname;
    }

    public SeedSample getSeedSample() {
        return seedSample;
    }

    public void setSeedSample(SeedSample seedSample) {
        this.seedSample = seedSample;
    }
}
