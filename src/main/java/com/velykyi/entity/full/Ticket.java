package com.velykyi.entity.full;

import com.velykyi.entity.Entity;

public class Ticket implements Entity<Integer>{
    private Integer id;
    private User user;
    private Flight flight;

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
