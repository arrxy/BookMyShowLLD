package com.arrxy.bms.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String number;
    @OneToMany
    private List<Seat> seats = new ArrayList<>();
}
