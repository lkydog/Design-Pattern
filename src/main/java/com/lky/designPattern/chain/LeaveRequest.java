package com.lky.designPattern.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Created by njy on 2023/6/5
 * 请假信息
 */
@AllArgsConstructor
@Data
public class LeaveRequest {
    //请假人姓名
    private String name;
    //请假天数
    private Integer days;
}
