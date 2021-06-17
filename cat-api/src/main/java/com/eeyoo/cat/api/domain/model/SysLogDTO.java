/**
 * Copyright (c), 2015-2021, io.eye
 * FileName: SysLogDTO
 * Author:   feilin
 * Date:     2021/6/18 上午12:43
 * Description:
 */
package com.eeyoo.cat.api.domain.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 系统操作日志查询对象
 */
@Data
public class SysLogDTO {

    private String type;

    private LocalDateTime[] createTime;

    public SysLogDTO() {}
}
