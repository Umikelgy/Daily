package com.my.daily.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/3 17:31
 **/
@Data
public class EventUpdateDto {
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String description;
    private int eventLevel;
}
