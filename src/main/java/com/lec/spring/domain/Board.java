package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Board {
    private Long id;
    private String title;
    private String content;
    private Long viewcnt;
    private LocalDateTime regdate;

    private User user;
    private Club club;
    private BoardType boardType;
}
