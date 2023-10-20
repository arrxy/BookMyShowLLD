package com.arrxy.bms.Models;

import java.util.ArrayList;
import java.util.List;

public class City extends BaseModel {
    private String name;
    private List<Theatre> theatres = new ArrayList<>();
}
