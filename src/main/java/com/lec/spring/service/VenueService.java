package com.lec.spring.service;

import com.lec.spring.domain.Venue;

public interface VenueService {

    Venue findByCategory(String venue_category);
}
