package com.lec.spring.service;

import com.lec.spring.domain.Reservation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public int write(Reservation reservation) {
        return 0;
    }

    @Override
    public List<Reservation> list() {
        return List.of();
    }

    @Override
    public int update(Reservation reservation) {
        return 0;
    }
}
