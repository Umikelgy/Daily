package com.my.daily.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/3 13:49
 **/
@Data
public class EventDto {
    private long id;
    private String name;
    private LocalDateTime create_time;
    private String description;


}
