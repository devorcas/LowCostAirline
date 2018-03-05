package com.velykyi.entity.full;

import com.velykyi.entity.Entity;

import java.time.LocalDate;

public class Flight implements Entity<Integer>{
    private Integer id;
    private String departurePoint;
    private String arrivalPoint;
    private LocalDate departureDate;
    private LocalDate arrivalDate;
    private String airplane;
    private Integer price;
    private Boolean baggage;

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public void setAirplane(String airplane) {
        this.airplane = airplane;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAirplane() {
        return airplane;
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
