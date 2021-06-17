/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: SysLogMapper
 * Author:   feilin
 * Date:     2021/6/18 上午12:40
 * Description:
 */
package com.eeyoo.cat.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eeyoo.cat.api.domain.model.SysLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysLogMapper extends BaseMapper<SysLog> {
    
}
