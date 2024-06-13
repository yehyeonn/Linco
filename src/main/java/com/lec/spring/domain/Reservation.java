package com.lec.spring.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {

    private Long id;
    private Venue venue;
    private LocalDate reservate_date;
    private LocalTime reservate_start_time;
    private LocalTime reservate_end_time;
    private String status;
}
