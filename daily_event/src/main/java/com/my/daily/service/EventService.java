package com.my.daily.service;

import com.my.daily.dto.EventAllDto;
import com.my.daily.dto.EventDto;
import com.my.daily.dto.EventUpdateDto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/3 13:47
 **/
public interface EventService {
    /**
     *
     * 获取全部事件基本信息*(id ,name ,create_time, description)
     *@return
     *@anthor  10068921
     */
    List<EventDto> eventList();
/**
 *@description
 * 添加事件
 *@anthor  10068921
 */
   void addEvent(EventUpdateDto eventUpdateDto);
   /**
    * 修改事件
    * */
    void modifyEvent(EventAllDto eventAllDto);

    /**通过创建时间删除*/
    void deleteEventByCTime(LocalDateTime createTime);
}
