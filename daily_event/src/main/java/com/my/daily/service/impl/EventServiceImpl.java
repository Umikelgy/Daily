package com.my.daily.service.impl;

import com.my.daily.dto.EventAllDto;
import com.my.daily.dto.EventDto;
import com.my.daily.dao.mysql.EventMapper;
import com.my.daily.dto.EventUpdateDto;
import com.my.daily.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/3 13:58
 **/
@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventMapper eventMapper;
    @Override
    public List<EventDto> eventList() {
        return eventMapper.selectEventDto();
    }

    @Override
    public void addEvent(EventUpdateDto eventUpdateDto) {
            eventMapper.insert(eventUpdateDto);
    }

    @Override
    public void modifyEvent(EventAllDto eventAllDto) {
            eventMapper.update(eventAllDto);
    }

    @Override
    public void deleteEventByCTime(LocalDateTime createTime) {
            eventMapper.delete(createTime);
    }
}
