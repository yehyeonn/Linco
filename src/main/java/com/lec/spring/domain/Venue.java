package com.lec.spring.domain;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Venue {
    private Long id;
    private String venu_name;
    private String address;
    private int limit_num;
    private String venu_category;
    private String info_tel;
    private int price;
    private int total_price;
    private LocalTime open_time;
    private LocalTime close_time;
    private LocalDate reservate_date;
    private LocalTime reservate_start_time;
    private LocalTime reservate_end_time;
    private String img;
    private LocalDateTime paydate;
}
