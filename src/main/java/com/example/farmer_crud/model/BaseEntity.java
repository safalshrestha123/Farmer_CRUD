package com.example.farmer_crud.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@MappedSuperclass

public class BaseEntity  {

    private int createdDate;
    private int updateddate;
}
