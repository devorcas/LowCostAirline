package com.velykyi.entity.full;

import com.velykyi.entity.Entity;
import com.velykyi.entity.full.enums.AirPlane;
import com.velykyi.entity.full.enums.CityDestinations;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.PrintWriter;
import java.time.LocalDate;

public class Flight implements Entity<Integer>{
    private Integer id;
    private CityDestinations departurePoint;
    private CityDestinations arrivalPoint;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private AirPlane airplane;
    private Integer price;
    private Boolean baggage;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CityDestinations getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(CityDestinations departurePoint) {
        this.departurePoint = departurePoint;
    }

    public CityDestinations getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(CityDestinations arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public AirPlane getAirplane() {
        return airplane;
    }

    public void setAirplane(AirPlane airplane) {
        this.airplane = airplane;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Boolean getBaggage() {
        return baggage;
    }

    public void setBaggage(Boolean baggage) {
        this.baggage = baggage;
    }
}
