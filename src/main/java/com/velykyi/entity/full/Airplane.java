package com.velykyi.entity.full;

import com.velykyi.entity.Entity;
import com.velykyi.entity.full.enums.AirPlaneModel;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashSet;

public class Airplane implements Entity<Integer>{
    private Integer id;
    private int amountOfSitting;
    private AirPlaneModel brandAndModel;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmountOfSitting() {
        return amountOfSitting;
    }

    public void setAmountOfSitting(Integer amountOfSitting) {
        this.amountOfSitting = amountOfSitting;
    }

    public AirPlaneModel getBrandAndModel() {
        return brandAndModel;
    }

}
