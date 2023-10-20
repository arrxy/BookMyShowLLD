package com.arrxy.bms.Models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Show extends BaseModel {
    private Movie movie;
    private Screen screen;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String language;
    private List<Feature> features = new ArrayList<>();
}
