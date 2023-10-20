package com.arrxy.bms.Models;

import java.util.ArrayList;
import java.util.List;

public class Theatre extends BaseModel {
    private String name;
    private String address;
    private List<Screen> screens = new ArrayList<>();
    private List<Show> shows = new ArrayList<>();
}
