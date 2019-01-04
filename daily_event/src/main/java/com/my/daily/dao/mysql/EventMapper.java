package com.my.daily.dao.mysql;

import com.my.daily.dto.EventAllDto;
import com.my.daily.dto.EventDto;
import com.my.daily.dto.EventUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;
import java.util.List;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/3 14:12
 **/
@Component
@Mapper
public interface EventMapper {
    /**
     * 查询EventDto属性的内容
     *@return
     *@anthor  10068921
     **/
    List<EventDto> selectEventDto();

    void insert(EventUpdateDto eventUpdateDto);

    void update(EventAllDto eventAllDto);

    void delete(LocalDateTime createTime);
}
