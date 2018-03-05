package com.velykyi.entity.full;

import com.velykyi.entity.Entity;

public class Ticket implements Entity<Integer>{
    private Integer id;
    private User user;
    private Flight flight;
    private Boolean baggage;
    private Boolean priorityRegistrationLanding;
    private Integer fullPrice;

    public Integer getFullPrice() {
        return fullPrice;
    }

    private void setFullPrice(Integer fullPrice) {
        // TODO calculate price depends on curent date, deparure date , baggege, priorty lending
    }

    public Boolean getBaggage() {
        return baggage;
    }

    public void setBaggage(Boolean baggage) {
        this.baggage = baggage;
    }

    public Boolean getPriorityRegistrationLanding() {
        return priorityRegistrationLanding;
    }

    public void setPriorityRegistrationLanding(Boolean priorityRegistrationLanding) {
        this.priorityRegistrationLanding = priorityRegistrationLanding;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
