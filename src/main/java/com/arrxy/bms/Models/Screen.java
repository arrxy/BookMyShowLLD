package com.arrxy.bms.Models;

import java.util.ArrayList;
import java.util.List;

public class Screen extends BaseModel {
    private String number;
    private List<Seat> seats = new ArrayList<>();
    private List<Show> shows;
}
