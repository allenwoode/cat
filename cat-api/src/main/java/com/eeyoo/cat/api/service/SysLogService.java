package com.eeyoo.cat.api.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.eeyoo.cat.api.domain.model.SysLog;
import com.eeyoo.cat.api.domain.model.SysLogDTO;

public interface SysLogService extends IService<SysLog> {
    
    Page getLogByPage(Page page, SysLogDTO sysLog);
    
}
