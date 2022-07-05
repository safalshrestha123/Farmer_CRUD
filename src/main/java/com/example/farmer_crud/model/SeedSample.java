package com.example.farmer_crud.model;

import javax.persistence.*;

@Entity
@Table(name = "seed_samples")
public class SeedSample extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String seedsamplename;
    private String collectedaddress;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "seedSample")
    private SeedAddress address;





    public SeedSample() {

    }

    public SeedSample(int id, String seedsamplename, String collectedaddress) {
        this.id = id;
        this.seedsamplename = seedsamplename;
        this.collectedaddress = collectedaddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeedsamplename() {
        return seedsamplename;
    }

    public void setSeedsamplename(String seedsamplename) {
        this.seedsamplename = seedsamplename;
    }

    public String getCollectedaddress() {
        return collectedaddress;
    }

    public void setCollectedaddress(String collectedaddress) {
        this.collectedaddress = collectedaddress;
    }
}
