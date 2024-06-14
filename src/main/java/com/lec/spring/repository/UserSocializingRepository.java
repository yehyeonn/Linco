package com.lec.spring.repository;

import com.lec.spring.domain.User;

import java.util.List;

public interface UserSocializingRepository {

    // 특정 글의 유저 목록
    List<User> findByUserSocializing(Long socializing_id);

    // 참가 버튼 눌렀을 때 저장되는 유저
    int save(User user);
}
