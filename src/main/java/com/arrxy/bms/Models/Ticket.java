package com.arrxy.bms.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    @OneToMany
    private List<Payment> payments = new ArrayList<>();
    private Double amount;
    @OneToMany
    private List<ShowSeat> seats = new ArrayList<>();
    @Enumerated
    private TicketStatus status;
}
