/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: SysLog
 * Author:   feilin
 * Date:     2021/6/18 上午12:39
 * Description:
 */
package com.eeyoo.cat.api.domain.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SysLog implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    
    private String type;
    
    private String title;
    
    private String createBy;
    
    private LocalDateTime createTime;
    
    private LocalDateTime updateTime;
    
    private String remoteAddr;
    
    private String userAgent;
    
    private String requestUri;
    
    private String method;
    
    private String params;
    
    private Long time;
    
    private String exception;
    
    private String serviceId;
    
    @TableLogic
    private String delFlag;
    
    public SysLog() {}
}
