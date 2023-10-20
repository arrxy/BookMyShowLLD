package com.arrxy.bms.Models;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private Double amount;
    private Show show;
    private List<Seat> seats = new ArrayList<>();
    private TicketStatus status;

}
