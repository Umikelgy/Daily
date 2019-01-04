package com.my.daily.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/3 14:34
 **/
@Data
public class EventAllDto {
    private long id;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private LocalDateTime readTime;
    private String description;
    private int eventLevel;
    private int readTimes;
}
