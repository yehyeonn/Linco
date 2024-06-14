package com.lec.spring.service;

import com.lec.spring.domain.Venue;
import com.lec.spring.repository.VenueRepository;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenueServiceImpl implements VenueService {

    private VenueRepository venueRepository;

    @Autowired
    public VenueServiceImpl(SqlSession sqlSession){
        venueRepository = sqlSession.getMapper(VenueRepository.class);
    }

    @Override
    public Venue findByCategory(String venue_category) {
        return venueRepository.findByCategory(venue_category);
    }
}
