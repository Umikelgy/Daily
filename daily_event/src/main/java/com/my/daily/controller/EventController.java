package com.my.daily.controller;

import com.my.daily.dto.EventAllDto;
import com.my.daily.dto.EventDto;
import com.my.daily.dto.EventUpdateDto;
import com.my.daily.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/3 14:58
 **/
@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @RequestMapping("listAllEventDto")
    public List<EventDto> eventDtos(){
       return eventService.eventList();
    }
    @RequestMapping("addEvent")
    public  List<EventDto> addEvent(){
        EventUpdateDto eventUpdateDto=new EventUpdateDto();
        eventUpdateDto.setName("lgy");
        eventUpdateDto.setCreateTime(LocalDateTime.now());
        eventUpdateDto.setDescription("new Event2");
        eventUpdateDto.setEventLevel(2);
        eventUpdateDto.setUpdateTime(LocalDateTime.now());
        eventService.addEvent(eventUpdateDto);
       return eventService.eventList();

    }
    @RequestMapping("updateEventName")
    public  List<EventDto> updateEventName(@RequestParam(value = "createTime" ) String createTime){
        EventAllDto eventAllDto=new EventAllDto();
        eventAllDto.setName("lgy2");
        CharSequence charSequence=createTime.subSequence(0,createTime.length());
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        eventAllDto.setCreateTime(LocalDateTime.parse(charSequence,formatter));
        eventService.modifyEvent(eventAllDto);
        return eventService.eventList();

    }
    @RequestMapping("deleteEventByCreateTime")
    public List<EventDto> deleteEventByCreateTime(@RequestParam(value = "createTime")String createTime){
        CharSequence charSequence=createTime.subSequence(0,createTime.length());
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        eventService.deleteEventByCTime(LocalDateTime.parse(charSequence,formatter));
        return eventService.eventList();
    }

}
